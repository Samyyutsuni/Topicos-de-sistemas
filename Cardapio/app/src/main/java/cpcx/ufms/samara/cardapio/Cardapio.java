package cpcx.ufms.samara.cardapio;

import java.io.Serializable;

/**
 * Created by jose on 15/12/2015.
 */
public class Cardapio implements Serializable {
    String nome;
    String ingredientes;
    double VALOR;

    public Cardapio(String nome, String ingredientes, double VALOR) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.VALOR = VALOR;
    }

    @Override
    public String toString() {
        return nome;
    }
}
