public class Filme {

    int duracaoEmMinutos;
    int TotalDeAvaliacoes;
    double somaDasAvaliacoes;
    String nome;
    boolean IncluidoNoplano;

    public void avalia(int nota){

        somaDasAvaliacoes += nota;

    }

    public void pegaMedia(){

        somaDasAvaliacoes /= TotalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return TotalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}



