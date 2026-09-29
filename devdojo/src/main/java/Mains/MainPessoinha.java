package Mains;

import Entity.Pessoinha;

public class MainPessoinha {
    public static void main(String... args) {
        Pessoinha pessoa = new Pessoinha();
        pessoa.setNome("joão");
        pessoa.setIdade((byte)20);
        pessoa.setSexo('F');
        pessoa.imprime();

        String nome = pessoa.getNome();
        byte idade = pessoa.getIdade();
        char sexo = pessoa.getSexo();

        System.out.println("Meu nome é " + nome + "tenho " + idade + " anos e meu sexo é " + (sexo=='M'? "masculino":"feminino"));
    }
}