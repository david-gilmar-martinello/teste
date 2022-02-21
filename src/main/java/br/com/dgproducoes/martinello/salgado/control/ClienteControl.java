/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.control;

import br.com.dgproducoes.martinello.salgado.dao.ClienteCRUD;
import br.com.dgproducoes.martinello.salgado.model.Cliente;

/**
 *
 * @author david
 */
public class ClienteControl {

    private final ClienteCRUD clienteCRUD;

    public ClienteControl() {
        clienteCRUD = new ClienteCRUD();

    }

    public void salvarCliente(Cliente cliente) {
        clienteCRUD.insertFireBase(cliente);

    }

}
