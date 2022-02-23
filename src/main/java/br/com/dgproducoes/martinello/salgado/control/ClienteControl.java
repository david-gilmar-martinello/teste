/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.control;

import br.com.dgproducoes.martinello.salgado.dao.ClienteCRUD;
import br.com.dgproducoes.martinello.salgado.model.Cliente;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

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

//    public void initialize(URL url, ResourceBundle rb) {
//
//        if (clienteCRUD.readFibase()) {
//            System.out.println("Não houve Erros ");
//        } else {
//            System.out.println("Erro encontrado");
//        }
//
//    }
    public List<Cliente> read() {

        List<Cliente> lCliente = clienteCRUD.readFibase();

        return lCliente;

    }

    public List<Cliente> pesquisaFireBase(Cliente cliente) {

        List<Cliente> lCliente = clienteCRUD.readFireBaseWithFiltro(cliente);

        return lCliente;
    }

}
