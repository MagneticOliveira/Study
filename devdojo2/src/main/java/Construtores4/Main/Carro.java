package Construtores4.Main;

import Construtores4.Entity.EntityCarro;

public class Carro {
    public static void main(String... args) {
        EntityCarro carro1 = new EntityCarro("BMW", 280);
        EntityCarro carro2 = new EntityCarro("Mercedes", 300);
        EntityCarro carro3 = new EntityCarro("Audi", 290);

        //Static
        //Alterando o valor da velocidade limite para todos os objetos da classe

        carro1.setVelocidadeLimite(320);//Caso a classe seja static!!! independente de ser publica
        //CarroEntity.velocidadeLimite = 320;//Caso o atributo seja publico!!! independente de ser static
        //estes dois fazem a mesma coisa, alteram um valor global na classe inteira


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
        //agora todos os objetos têm 320 na velocidade limite, invés de 250 que era o valor da classe
        //se não fosse static e nem publica o atributo velocidadeLimite seria alterado somente em carro1




        //Só para relembrar:
        //set e get

        //Object carro1 = new object();
        //carro1.setVelocidadeLimite(320);
        //double valor0 = carro1.getVelocidadeLimite());

        //e

        //Utilizando um metodo static e public
        // static - para chamar sem instancia new CarroEntity();
        // public - para acessar de outra classe com o nome dela)
        // se for atributo, também vira um valor global na classe chamada
        //double valor1 = CarroEntity.getVelocidadeLimite();
    }
}

