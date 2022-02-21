/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.dao;

import br.com.dgproducoes.martinello.salgado.model.Cliente;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import java.util.HashMap;
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

    public ClienteCRUD() {
        ConectionFirebase firebase = new ConectionFirebase();
        bd = firebase.conctarBanco();
    }

// Adicionar, Buscar, Deletar, Atualizar
    public boolean insertFireBase(Cliente cliente) {
        boolean key = false;

        // Create a Map to store the data we want to set
        Map<String, Object> docCliente;
        docCliente = new HashMap<>();
        docCliente.put("nome", cliente.getNome());
        docCliente.put("email", cliente.getEmail());
        docCliente.put("dataNascimento", cliente.getDataNascimento());

        // Add a new document (asynchronously) in collection "cities" with id "LA"
        ApiFuture<WriteResult> future = bd.collection("Cliente").document(UUID.randomUUID().toString()).set(docCliente);

        // future.get() blocks on response
        try {
            System.out.println("Update time : " + future.get().getUpdateTime());
            key = true;

        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();

        }

        return key;
    }
}
