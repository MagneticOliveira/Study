package Methods;

import Entity.Estudante;
public class ImpressoraEstudante {



    //metodo para não ter que repetir os 3 souts
    public static void imprimir(Estudante estudante){
        //teste de refatoração quando é objeto, que refatora diferente de tipos primitivos
        //estudante.nome = "Gohan";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
