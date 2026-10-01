package Constructors.Mains;

import Constructors.Entity.AnimeEntityComConstrutor;

public class AnimeMainComConstrutor {
    public static void main(String... args) {
        //Agora o anime só inicializa o Objeto anime caso seja iniciado com todos os argumentos definidos no construtor
        AnimeEntityComConstrutor anime = new AnimeEntityComConstrutor("Boku no Hero Academia", "Shouren", 235, "Ação");
        anime.imprime();

        System.out.println("estamos aqui");

        //graças a sobrecarga de métodos, pode utilizar sem definir os atributos por haver dois construtores
        AnimeEntityComConstrutor anime2 = new AnimeEntityComConstrutor();
        anime2.imprime();
    }
}
