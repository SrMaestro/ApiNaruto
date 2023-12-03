package com.ConsumindoApiJava.demoConsumindoApiJava;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Debut {
    //declaração
    private String anime;
    private String appearsIn;

    //@Override: Esta anotação indica que o método a seguir está sendo sobrescrito de uma classe pai (geralmente da classe Object).
    @Override
    //O método toString() é frequentemente usado para fornecer uma representação legível de objetos para depuração ou logging
    public String toString() {
        return "Debut{" +
                "anime='" + anime + '\'' +
                ", appearsIn='" + appearsIn + '\'' +
                '}';
    }

    // Getts e Setters
    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getAppearsIn() {
        return appearsIn;
    }

    public void setAppearsIn(String appearsIn) {
        this.appearsIn = appearsIn;
    }
}
