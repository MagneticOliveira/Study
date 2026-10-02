package Construtores7.Entity;

import Construtores7.Enum.ClienteEnum;

public class ClienteEntity {
    private String nome;

    //Enum
    //é um tipo de objeto que permite criar um conjunto de constantes final nomeadas
    //uma lista de opções para garantir um padrão de preenchimento fixo
    private ClienteEnum tipo;

    //final
    //Constantes não alteram o valor após declaradas
    public static final String PESSOA_FISICA = "Pessoa_Fisica";
    public static final String PESSOA_JURIDICA = "Pessoa_Juridica";

    public ClienteEntity(String nome, ClienteEnum tipo){
        this.nome = nome;
        this.tipo = tipo;//isto é um objeto recebendo um objeto
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteEnum getTipo() {
        return tipo;
    }

    public void setTipo(ClienteEnum tipo) {
        this.tipo = tipo;
    }
}
