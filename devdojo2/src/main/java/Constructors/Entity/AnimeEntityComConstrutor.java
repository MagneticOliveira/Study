package Constructors.Entity;

public class AnimeEntityComConstrutor {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;

    //isto é o construtor gerado no new AnimeEntity(), está funcionando como metodo init()
    //assim fica melhor, pois garante os parâmetros necessários e diminui código
    public AnimeEntityComConstrutor(String name, String tipo, int episodios, String genero){
        System.out.println("Construtor inicializado");
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    //ele é gerado automaticamente com public AnimeEntity(){}, mas é bom escrever para alterá-lo,
    //por exemplo, ao definir parâmetros para ele, é definido que sem eles o objeto se quer pode ser inicializado

    public AnimeEntityComConstrutor(){
    }
    //isto se chama sobrecarga de métodos, sim funciona no construtor
    //metodos deste tipo podem ter o mesmo nome, mas devem ter parâmetros diferentes sem conflito

    public void imprime(){
        System.out.println("----------------------------------------------");
        System.out.println("Nome do Anime: " + this.name);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("episódios: " + this.episodios);
        System.out.println("gênero: " + this.genero);
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
