package Entity;

public class AnimeEntity {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;

    public AnimeEntity(){

    }


    //Metodo de inicializar um objeto com métodos
    public void init(String name, String tipo, int episodios, String genero){
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public void init(String name,  int episodios){
        this.name = name;
        this.episodios = episodios;
    }
    //isto se chama sobrecarga de métodos
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
