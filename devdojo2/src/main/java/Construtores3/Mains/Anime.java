package Construtores3.Mains;

import Construtores3.Entity.AnimeEntity;

public class Anime {
    public static void main(String... args) {
        AnimeEntity anime = new AnimeEntity("One Piece");
        for (int i=0; i<anime.getEpisodios().length; i++) {
            System.out.print(anime.getEpisodios()[i] + " ");
        }
    }
}
