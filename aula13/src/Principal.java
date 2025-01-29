import Modelos.Filme;
import Modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.setNome("Filme 1");
         filme.avaliar(10);
        filme.avaliar(05);

        Serie s1 = new Serie();
        s1.setNome("Serie 1");


        System.out.println(filme.toString());
    }


}