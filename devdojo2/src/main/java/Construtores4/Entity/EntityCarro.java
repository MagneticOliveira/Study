package Construtores4.Entity;

public class EntityCarro {
    private String nome;
    private double velocidadeMaxima;

    //Static
    //Mantém um valor único para todos da classe
    //e também permite acessar sem instanciar a classe "new CarroEntity();"
    //Ao alterar um valor no objeto, todos os outros são alterados também
    public static double velocidadeLimite = 250;
    //static permite acessar por meio da classe CarroEntity.velocidadeLimite = 300;
    //public permite acessar de outra classe que não CarroEntity

    {
    //isto é um bloco de inicialização
    }

    public EntityCarro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + EntityCarro.velocidadeLimite);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //funciona da mesma forma aqui
    //agora não é necessário dar new CarroEntity para acessar o metodo
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    //
    public static void setVelocidadeLimite(double vvelocidadeLimite) {
        velocidadeLimite = vvelocidadeLimite;
    }

    //this não funciona em metodos static
    //isto porque ele pode ser chamado sem instanciar e sem instanciar !poderiam!
    //não existir os atributos do construtor
    public static void setVelocidadeLimite2(double velocidadeLimite) {
        //this.velocidadeLimite = velocidadeLimite;//isto não funciona
        EntityCarro.velocidadeLimite = velocidadeLimite;
    }
}