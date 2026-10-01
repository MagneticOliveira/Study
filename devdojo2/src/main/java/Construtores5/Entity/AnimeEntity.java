package Construtores5.Entity;

public class AnimeEntity {
    private String nome;
    private static int[] episodios;

    //static no bloco de inicialização, faz ele ser executado uma única vez
    static {
        System.out.println("Bloco de inicialização executado");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Bloco de inicialização static 2 executado");
    }

    static {
        System.out.println("Bloco de inicialização static 3 executado");
    }

    {
        System.out.println("Bloco de inicialização não static executado");
    }

    public AnimeEntity(String nome) {
        this.nome = nome;
    }

    public AnimeEntity() {
        for (int i = 0; i < this.getEpisodios().length; i++) {
            System.out.print(this.getEpisodios()[i] + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}