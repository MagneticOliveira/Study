package Construtores8.Main;

import Construtores8.Entity.ClienteEntity;

public class Cliente {
    public static void main(String... args) {
        //chamando enum de dentro de uma classe invés de da própria classe enum
        ClienteEntity cliente1 = new ClienteEntity("João", ClienteEntity.TipoPagamento.Debito);
        ClienteEntity cliente2 = new ClienteEntity("Lucas", ClienteEntity.TipoPagamento.Credito);
        ClienteEntity cliente3 = new ClienteEntity("Enzo", ClienteEntity.TipoPagamento.Debito);
    }
}
