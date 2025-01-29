import br.alex.locadora.modelos.Filme;

public class Principal {

    public static void main(String[] args) {

        Filme f1 = new Filme();
        f1.avalia(9);
        f1.avalia(8);
        f1.avalia(7);


        System.out.println(f1.getTotalDeAvaliacao());
        System.out.println(f1.somaDasAvaliacoes);


    }

}