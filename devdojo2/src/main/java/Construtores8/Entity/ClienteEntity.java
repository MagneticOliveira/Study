package Construtores8.Entity;

public class ClienteEntity {

    //enum dentro da classe
    public enum TipoPagamento {
        Debito,
        Credito
    }


    private String nome;
    private TipoPagamento tipoPagamento;

    public ClienteEntity(String nome, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
    }
}
