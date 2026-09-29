package Mains;

import Entity.Estudante;
import Methods.ImpressoraEstudante;

public class MainEstudante {
    public static void main(String[] args) {
        //Entidade / Objeto Estudante sendo utilizada
        //Isto pode também pode ser feito num método

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 16;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 15;
        estudante2.sexo = 'F';


        System.out.println("\n-------------------------------------------");
        System.out.println("Situação das Entidades Iniciadas sem Métodos");
        System.out.println("-------------------------------------------");

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("-------------------------------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);






        System.out.println("\n\n-------------------------------------------");
        System.out.println("Entidade Chamada por Método como referência");
        System.out.println("-------------------------------------------");

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprimir(estudante1);
        System.out.println("-------------------------------------------");
        impressora.imprimir(estudante2);
        //isto é exatamente o mesmo que está acima em sout


        /*
        Toda e qualquer classe java é um objeto, mas nem tod* objeto é uma classe java.

        portanto, posso chamar um metodo ou objeto de uma classe (necessário static no metodoDentroDela)
        Classe.java.metodoDentroDela();

        ou inicializa-lá
        Classe nomeReference = new Classe();
        e depois utiliza-lá
        nomeReference.metodoDentroDela();
        */


        System.out.println("---------------------EX2-------------------");
        ImpressoraEstudante.imprimir(estudante1);
        System.out.println("-------------------------------------------");
        ImpressoraEstudante.imprimir(estudante2);
        //exatamente a mesma coisa dos dois acima


        //pus que estudante.nome = "Gohan" no metodo imprimir utilizando o parametro
        //Os objetos depois de passá-los como referência para o metodo alteram, diferentemente de quando é uma variável primitiva visto em MainCalculadora
        System.out.println("\n\n------------------------------------------------");
        System.out.println("Situação FINAL das Entidades Iniciadas sem Métodos");
        System.out.println("------------------------------------------------");

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("------------------------------------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}