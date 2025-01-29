package Modelos;

public class Serie extends Titulo {

    private String Temporadas;
    private int  episodioPorTemporada;
    public int minutosPorEpsódio;

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpsódio() {
        return minutosPorEpsódio;
    }

    public void setMinutosPorEpsódio(int minutosPorEpsódio) {
        this.minutosPorEpsódio = minutosPorEpsódio;
    }

    public String getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(String temporadas) {
        Temporadas = temporadas;



    }
}
