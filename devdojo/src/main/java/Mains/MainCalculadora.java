package Mains;

import Methods.ImpressoraCalculadora;

public class MainCalculadora {
    public static void main(String[] args) {
        System.out.println("\n\n");

        ImpressoraCalculadora calculadora = new ImpressoraCalculadora();
        System.out.println("Entidade ImpressoraCalculadora, com métodos: INICIADA");

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("Métodos void, (sem retorno de variável)");
        System.out.println("-------------------------------------------");

        calculadora.soma();
        calculadora.subitrai();
        calculadora.multiplica(10, 10);


        System.out.println("------------------------------------------");
        System.out.println("Métodos tipados, (com retorno em variável)");
        System.out.println("------------------------------------------");

        double result = calculadora.divide(10, 10);
        System.out.println(result);

        //quando o metodo ha void, não dá para utilizar como variável
        //System.out.println(calculadora.multiplica(10, 10));

        System.out.println("-------------------------------------------------------");
        System.out.println("(Teste de passagem de parâmetro por valor)");
        System.out.println("Método void está com numero1 e 2 declarados com 99 e 33");
        System.out.println("-------------------------------------------------------");

        int numero1 = 10;
        int numero2 = 10;
        calculadora.alterar(numero1,numero2);
        System.out.println(numero1);
        System.out.println(numero2);
        //Por ser void vai mostrar 99 e 33 no sout de lá e aqui 10 e 10.
        //Os 10 de numero1 e numero2 são parametrizados, utilizados, mas não alterados
    }
}