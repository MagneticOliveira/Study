package Mains;

import Entity.AnimeEntity;

public class AnimeMain {
    public static void main(String... args) {
        AnimeEntity anime = new AnimeEntity();
        anime.init("Boku no Hero Academia", "Shouren", 235, "Ação");
        anime.imprime();
    }
}
