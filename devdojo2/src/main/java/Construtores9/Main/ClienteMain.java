package Construtores9.Main;

import Construtores9.Entity.ClienteEntity;
import Construtores9.Enum.TipoCliente;

public class ClienteMain {
    public static void main(String... args) {
        ClienteEntity cliente1 = new ClienteEntity("João", ClienteEntity.TipoPagamento.Debito);
        ClienteEntity cliente2 = new ClienteEntity("Lucas", ClienteEntity.TipoPagamento.Credito);
        //Atribuindo Enum com referência direta
        ClienteEntity cliente3 = new ClienteEntity("Enzo", ClienteEntity.TipoPagamento.Debito, TipoCliente.PESSOA_JURIDICA);
        ClienteEntity cliente4 = new ClienteEntity("Enzo", ClienteEntity.TipoPagamento.Debito, TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}