package Entity;

public class Pessoinha {
    private String nome;
    private byte idade;
    private char sexo;

    public void imprime(){
        //this não funciona com static
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(byte idade){
        if(idade < 0 || idade > 140){
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }

    public byte getIdade(){
        return this.idade;
    }

    public char getSexo(){
        return this.sexo;
    }
}