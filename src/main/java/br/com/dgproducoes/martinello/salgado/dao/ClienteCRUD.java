/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.dao;

import br.com.dgproducoes.martinello.salgado.model.Cliente;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author david
 */
public class ClienteCRUD {

    private static Firestore bd = null;
    private boolean key;
    private Cliente cliente;

//    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
//    private DatabaseReference databaseReference = referencia.child("Cliente");
//
//    Query nomeClientes = databaseReference.orderByChild("nome");
    public ClienteCRUD() {
        ConectionFirebase firebase = new ConectionFirebase();
        bd = firebase.conctarBanco();
    }

// Adicionar, Buscar, Deletar, Atualizar
    public boolean insertFireBase(Cliente cliente) {
        key = false;

        // Create a Map to store the data we want to set
        Map<String, Object> docCliente;
        docCliente = new HashMap<>();
        docCliente.put("nome", cliente.getNome());
        docCliente.put("email", cliente.getEmail());
        docCliente.put("dataNascimento", cliente.getDataNascimento());
        docCliente.put("cpf", cliente.getCpf());
        docCliente.put("situacao", cliente.getSituacao());

        // Add a new document (asynchronously) in collection "cities" with id "LA"
        ApiFuture<WriteResult> future = bd.collection("Cliente").document(UUID.randomUUID().toString()).set(docCliente);

        // future.get() blocks on response
        try {
            System.out.println("Update time : " + future.get().getUpdateTime());
            key = true;
            bd.close();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return key;
    }

    public List<Cliente> readFibase() {
        key = false;
        List<Cliente> lClientes = new LinkedList<>();

        try {
            //asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> future = bd.collection("Cliente").get();

            // future.get() blocks on response
            List<QueryDocumentSnapshot> documents;

            documents = future.get().getDocuments();

            if (!documents.isEmpty()) {

                for (QueryDocumentSnapshot document : documents) {
                    System.out.println(document.getId() + " => " + document.getData().get("nome"));
                    cliente = new Cliente(document.getData().get("nome").toString(), document.getData().get("email").toString(),
                            document.getData().get("dataNascimento").toString(), document.getData().get("cpf").toString(), document.getData().get("situacao").toString());

                    lClientes.add(cliente);
                }
            }
            key = true;
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }

        return lClientes;
    }

    public List<Cliente> readFireBaseWithFiltro(Cliente cliente) {
        List<Cliente> lCliente = new LinkedList<>();
        ApiFuture<QuerySnapshot> future;

        try {

            //asynchronously retrieve multiple documents
            if (cliente.getNome().length() < 1) {
                 future = bd.collection("Cliente").whereEqualTo("cpf", cliente.getCpf()).get();

            } else {

                future = bd.collection("Cliente").whereEqualTo("nome", cliente.getNome()).get();
            }

            // future.get() blocks on response
            List<QueryDocumentSnapshot> documents;

            documents = future.get().getDocuments();

            for (DocumentSnapshot document : documents) {
                System.out.println(document.getId() + " => " + document.getData().get("Nome"));
                cliente = new Cliente(document.getData().get("nome").toString(), document.getData().get("email").toString(),
                        document.getData().get("dataNascimento").toString(), document.getData().get("cpf").toString(), document.getData().get("situacao").toString());

                lCliente.add(cliente);

            }

        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }

        return lCliente;
    }

}
