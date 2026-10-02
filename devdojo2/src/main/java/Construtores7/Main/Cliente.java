package Construtores7.Main;

import Construtores7.Entity.ClienteEntity;

import Construtores7.Enum.ClienteEnum;

public class Cliente {
    public static void main(String... args) {
        ClienteEntity cliente1 = new ClienteEntity("Tsubasa", ClienteEnum.Pessoa_Fisica);
        ClienteEntity cliente2 = new ClienteEntity("Tsubasa", ClienteEnum.Pessoa_Fisica);
        ClienteEntity cliente3 = new ClienteEntity("TSubasa", ClienteEnum.Pessoa_Fisica);
        ClienteEntity cliente4 = new ClienteEntity("TSubasa", ClienteEnum.Pessoa_Juridica);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
