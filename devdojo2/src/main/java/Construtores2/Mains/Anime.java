package Construtores2.Mains;

import Construtores2.Entity.AnimeEntity;

public class Anime {
    public static void main(String... args) {
        AnimeEntity anime = new AnimeEntity("Boku no Hero Academia", "Shouren", 235, "Ação", "Ghibli", (byte)5);
        anime.imprime();
    }
}