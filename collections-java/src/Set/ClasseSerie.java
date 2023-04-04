import java.util.Comparator;
import java.util.Objects;

class Series implements Comparable<Series>{
    String nome;
    String genero;
    Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Series serie = (Series) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
            if (tempoEpisodio != 0) return tempoEpisodio;

            return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series>{

    @Override
    public int compare(Series s1, Series s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
