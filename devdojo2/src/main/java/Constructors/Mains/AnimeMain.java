package Constructors.Mains;

import Constructors.Entity.AnimeEntity;

public class AnimeMain {
    public static void main(String... args) {
        //Agora o anime só inicializa o Objeto anime caso seja iniciado com um nome
        AnimeEntity anime = new AnimeEntity("BKNHA");
        anime.init("Boku no Hero Academia", "Shouren", 235, "Ação");
        anime.imprime();
    }
}
