package com.ConsumindoApiJava.demoConsumindoApiJava;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VoiceActors {
    private String japanese;
    private String english;

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "VoiceActors{" +
                "japanese='" + japanese + '\'' +
                ", english='" + english + '\'' +
                '}';
    }

}
