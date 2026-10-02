package Construtores9.Entity;

import Construtores9.Enum.TipoCliente;

public class ClienteEntity {

    //enum dentro da classe
    public enum TipoPagamento {
        Debito,
        Credito
    }

    private String nome;
    private TipoPagamento tipoPagamento;

    private TipoCliente tipoCliente;


    public ClienteEntity(String nome, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;

    }
    public ClienteEntity(String nome, TipoPagamento tipoPagamento, TipoCliente tipoCliente) {
        this(nome, tipoPagamento);
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                (tipoCliente==null? "":
                        ", tipoCliente=" + tipoCliente.getValor() +
                        ", tipoClienteRelatorio=" + tipoCliente.getNomeRelatorio()) +
                '}';
    }
}
