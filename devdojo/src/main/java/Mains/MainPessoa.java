package Mains;

import Entity.Pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome  = "João";
        pessoa1.idade = 30;
        pessoa1.sexo  = 'M';

        pessoa2.nome  = "João";
        pessoa2.idade = 30;
        pessoa2.sexo  = 'M';

        pessoa1.imprime();
        pessoa1.imprime();


        //o metodo "imprime" dentro da entidade/objeto/classe "Pessoa", permite o uso de this, que se refere a própria entidade/objeto/classe Pessoa
        //ao gerar um objeto do tipo Pessoa, tanto os atributos quanto os métodos são herdados e podem ser utilizados
        //isto evita a necessidade de repetir os códigos:
        //como criar uma classe de métodos (Impressora Pessoa impressora = new ImpressoraPessoa impressora.imprime(pessoa1))
        //ou com static ImpressoraPessoa.imprime(pessoa1) ou até Pessoa.imprime(pessoa1) (se o metodo na entidade fosse static, que desfunciona o this)
    }
}
