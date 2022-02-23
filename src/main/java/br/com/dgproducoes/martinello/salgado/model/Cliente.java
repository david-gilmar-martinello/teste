/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dgproducoes.martinello.salgado.model;

import com.google.cloud.Date;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.towel.el.annotation.Resolvable;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author david
 */
public class Cliente extends RecursiveTreeObject<Cliente> implements Serializable {

    @Resolvable(colName = "Nome")
    String nome;

    @Resolvable(colName = "Email")
    String email;

    @Resolvable(colName = "Data Nascimento")
    String dataNascimento;

    @Resolvable(colName = "CPF")
    String cpf;

    @Resolvable(colName = "Situação")
    String situacao;

    public Cliente() {
    }

    public Cliente(String nome, String email, String dataNascimento, String cpf, String situacao) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cpf =cpf;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento =dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
