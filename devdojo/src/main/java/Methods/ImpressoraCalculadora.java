package Methods;

public class ImpressoraCalculadora {
    private int numero1 = 10;
    private int numero2 = 10;

    public void soma() {
        System.out.println(numero1 + numero2);
    }

    public void subitrai(){
        System.out.println(numero1 - numero2);
    }

    public void multiplica(int numero1, int numero2){
        System.out.println(numero1 * numero2);

    }

    public double divide(float numero1, float numero2){
        if(numero2==0 || numero1 == 0){
            return 0;
        }
        return numero1 / numero2;
    }

    public void alterar(double numero1 ,double numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera:");
        System.out.println("numero1: "+numero1);
        System.out.println("numero1: "+numero2);
    }
}