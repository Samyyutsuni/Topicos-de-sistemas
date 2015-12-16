package com.example.samara.telasuser.model;

import java.io.Serializable;

/**
 * Created by Samara on 12/11/2015.
 */
public class User implements Serializable {
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
