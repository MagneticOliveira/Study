
import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String... args) {

        //Lista sem diamonds tipados
        List nomes = new ArrayList(); //1.4

        nomes.add("William");
        nomes.add ("Maria");
        nomes.add (121);
        nomes.add("João");

        for(Object nome: nomes){
            System.out.println(nome);
        }

        System.out.println("--------------------------------------------");
        System.out.println("---------------Jeito1--------------");
        //Lista com diamonds tipados
        List<String> nomes2 = new ArrayList();

        nomes2.add("Wiliam");
        nomes2.add("Maria");
        //nomes2.add(121); //Erro de compilação, pois a lista é tipada para String
        nomes2.add("João");


        //posso utilizar String invés de Object, sendo que a lista é tipada para tal
        for(Object nome: nomes2){
            System.out.println(nome);
        }

        System.out.println("---------------Jeito2--------------");

        for(String nome: nomes2){
            System.out.println(nome);
        }

        System.out.println("---------------Jeito3--------------");

        for(int i = 0; i < nomes2.size(); i++ ){
            System.out.println(nomes2.get(i));
        }

        //ele muda a sintaxe por ser uma interface
        //size() retorna o tamanho da lista
        //get(i) retorna o elemento na posição i da lista

        //invés de length() e um simples [i]
    }
}
