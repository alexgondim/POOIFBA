package br.com.aula10.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaDeAvaliacao;
    private int totalDeAvaliacao;


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSomaDeAvaliacao(double somaDeAvaliacao) {
        this.somaDeAvaliacao = somaDeAvaliacao;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }



    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaDeAvaliacao() {
        return somaDeAvaliacao;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

}