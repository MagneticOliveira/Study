package Construtores6.Main;

import Construtores6.Entity.JogadorEntity;

public class Jogador {
    public static void main(String[] args) {
        JogadorEntity jogador1 = new JogadorEntity("Pelé");
        JogadorEntity jogador2 = new JogadorEntity("Ney");
        JogadorEntity jogador3 = new JogadorEntity("Cristiano");

        //arrays em objetos
        JogadorEntity[] jogadores = new JogadorEntity[]{jogador1, jogador2, jogador3};

        for (int i=0; i< jogadores.length; i++){
            jogadores[i].imprime();
        }
        System.out.println("---------------------------------------------------");
        for(JogadorEntity jogador:jogadores){
            jogador.imprime();
        }
    }
}
