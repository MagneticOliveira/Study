package Construtores3.Entity;

public class AnimeEntity {
    private String nome;
    private int[] episodios;

    //Bloco de inicialização "{}"
    //Isto é executado antes de todos e quaisquer construtores
    {
        System.out.println("Bloco de inicialização executado");
        System.out.println("Isto é executado antes de qualquer construtor");

        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    //é usado para garantir que antes do construtor ser executado, todos os processos necessários
    //sejam executados antes, ajudando a utilizar gets sem conflito quando há sobrecarga de construtores
    //com processos importantes, deixando os processos dentro de um iniciador "{}", eles sempre serão executados.

    public AnimeEntity(String nome) {
        this.nome = nome;
    }

    public AnimeEntity(){
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}

//A sequencia do que acontece na execução do construtor é a seguinte:

//0 - "tod* e qualquer static é executado"
//1 - é Alocado espaço na memória para o objeto
//2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
//3 - Bloco de inicialização é executado
//4 - Construtor é executado