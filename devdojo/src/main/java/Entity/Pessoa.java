package Entity;

public class Pessoa {
    public String nome;
    public byte idade;
    public char sexo;

    public void imprime(){
        //this não funciona com static
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
