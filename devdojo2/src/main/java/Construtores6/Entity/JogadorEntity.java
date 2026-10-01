package Construtores6.Entity;

public class JogadorEntity {
    private String nome;


    public void imprime(){
        System.out.println(
        "Nome do jogador: " + this.nome
        );
    }
    public JogadorEntity(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
