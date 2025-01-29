public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.nome = ("Stuart Lintel");
        filme.duracaoEmMinutos = 120;
        filme.TotalDeAvaliacoes = 100;
        filme.avalia(50);
        filme.avalia(80);
        filme.avalia(100);
        filme.pegaMedia();
        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.duracaoEmMinutos);
        System.out.println(filme.TotalDeAvaliacoes);
        System.out.println(filme.nome);

    }

}