import br.com.aula10.modelos.Filmes;

public class Principal {
    public static void main(String[] args) {

        Filmes f1 = new Filmes();
        f1.setNome("Filme 1");
        f1.setDuracaoEmMinutos(180);
        f1.setDiretor("Sitve Spilberg");
        System.out.println(f1.getDiretor());
        System.out.println(f1.getNome());
        System.out.println(f1.getDuracaoEmMinutos());
    }
}