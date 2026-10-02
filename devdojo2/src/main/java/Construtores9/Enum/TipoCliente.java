package Construtores9.Enum;

public enum TipoCliente {
    //enum com construtor
    //permite referênciar valores, escrevi um e recebi outro
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int VALOR;
    private final String NOME_RELATORIO;

    TipoCliente(int valor, String NOME_RELATORIO){
        this.VALOR = valor;
        this.NOME_RELATORIO = NOME_RELATORIO;
    }

    public int getValor(){
        return VALOR;
    }

    public String getNomeRelatorio(){
        return NOME_RELATORIO;
    }
}
