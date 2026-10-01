package Construtores2.Entity;

public class AnimeEntity {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    private byte estrelas;

    public AnimeEntity(String name, String tipo, int episodios, String genero){
        System.out.println("Construtor Principal inicializado");
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        System.out.println("Objeto preenchido faltando estudio");
    }

    //this();
    //chama o construtor como metodo, e retorna os seus parâmetros, pós execução.
    //não pode ter nada antes dele ex: sout("estouaqui"); acima de this(name, tipo...);
    //ele só funciona em construtores
    public AnimeEntity(String name, String tipo, int episodios, String genero, String estudio){
        this(name, tipo, episodios, genero);
        System.out.println("Dentro do construtor this(); Para adicionar novo atributo estudio ao objeto");
        this.estudio = estudio;
    }
    public AnimeEntity(String name, String tipo, int episodios, String genero, String estudio, byte estrelas){
        this(name, tipo, episodios, genero, estudio);
        System.out.println("Dentro do segundo construtor this(); Para adicionar novo atributo estrelas ao objeto");
        this.estrelas = estrelas;
    }
    public void imprime(){
        System.out.println("----------------------------------------------");
        System.out.println("Nome do Anime: " + this.name);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Estudio: " + this.estudio);
        System.out.println("Estrelas: " + this.estrelas);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
