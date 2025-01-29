package br.alex.locadora.modelos;

public class Filme {
    String nome;
    int anoDeLancamento;
    Boolean incluidoNoPlano;
    public double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinuto;

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;

    }

    int getTotalDeAvaliacao() {
        return totalDeAvaliacao;

    }
}
