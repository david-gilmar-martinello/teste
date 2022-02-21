/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.model;

import com.google.cloud.Date;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author david
 */
public class Cliente extends RecursiveTreeObject<Cliente> implements Serializable {

    StringProperty nome;
    StringProperty email;
    StringProperty dataNascimento;

    public Cliente() {
    }

    public Cliente(String nome, String email, String dataNascimento) {
        this.nome = new SimpleStringProperty(nome);
        this.email = new SimpleStringProperty(email);
        this.dataNascimento = new SimpleStringProperty(dataNascimento);
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome = new SimpleStringProperty(nome);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email = new SimpleStringProperty(email);
    }

    public String getDataNascimento() {
        return dataNascimento.get();
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = new SimpleStringProperty(dataNascimento);
    }

}
