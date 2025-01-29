package Modelos;

public class Titulo {

    private String nome;
    private String genero;
    private int duracaoPorMinuto;
    private boolean ativo = true;
    private int totalDeAvaliacoes;
    private double somaDeAvaliacoes;


    public void avaliar(double nota) {
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getDuracaoPorMinuto() {
        return duracaoPorMinuto;
    }

    public void setDuracaoPorMinuto(int duracaoPorMinuto) {
        this.duracaoPorMinuto = duracaoPorMinuto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSomaDeAvaliacoes() {
        return somaDeAvaliacoes;
    }

    public void setSomaDeAvaliacoes(double somaDeAvaliacoes) {
        this.somaDeAvaliacoes = somaDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }


    public double pegaMedia() {
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "ativo=" + ativo +
                ", duracaoPorMinuto=" + duracaoPorMinuto +
                ", genero='" + genero + '\'' +
                ", nome='" + nome + '\'' +
                ", somaDeAvaliacoes=" + somaDeAvaliacoes +
                ", totalDeAvaliacoes=" + totalDeAvaliacoes +
                '}';
    }


}
