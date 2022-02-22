/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.dao;

import br.com.dgproducoes.martinello.salgado.model.Cliente;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class ClienteCRUD {

    private static Firestore bd = null;
    private boolean key;

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

    public boolean readFibase() {
        key = false;

        try {
            //asynchronously retrieve all documents
            ApiFuture<QuerySnapshot> future = bd.collection("Cliente").get();

            // future.get() blocks on response
            List<QueryDocumentSnapshot> documents;

            documents = future.get().getDocuments();

            if (!documents.isEmpty()) {

                for (QueryDocumentSnapshot document : documents) {
                    System.out.println(document.getId() + " => " + document.getData().get("Nome"));

                }
            }
            key = true;
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }

        return key;
    }
}
