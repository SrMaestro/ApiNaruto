package com.ConsumindoApiJava.demoConsumindoApiJava.Character;

import com.ConsumindoApiJava.demoConsumindoApiJava.Debut;
import com.ConsumindoApiJava.demoConsumindoApiJava.Personal;
import com.ConsumindoApiJava.demoConsumindoApiJava.VoiceActors;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

// A anotação @JsonIgnoreProperties(ignoreUnknown = true) indica que propriedades desconhecidas
// devem ser ignoradas ao desserializar o objeto JSON para esta classe.
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {

    // Declaração de variáveis de instância para armazenar os dados do personagem.
    private  List<String> characters;
    private long id; // Identificador único do personagem.
    private String name; // Nome do personagem.
    private List<String> images; // Lista de URLs de imagens do personagem.
    private Debut debut; // Objeto representando a estreia do personagem.
    private List<String> jutsu; // Lista de habilidades especiais do personagem.
    private List<String> natureType; // Lista de tipos de natureza do chakra do personagem.

    private Personal personal; // Objeto contendo informações pessoais do personagem.

    private List<String> tools; // Lista de ferramentas associadas ao personagem.
    private VoiceActors voiceActors; // Objeto representando os dubladores do personagem.

    public VoiceActors getVoiceActors() {
        return voiceActors;
    }

    public void setVoiceActors(VoiceActors voiceActors) {
        this.voiceActors = voiceActors;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<String> getNatureType() {
        return natureType;
    }

    public void setNatureType(List<String> natureType) {
        this.natureType = natureType;
    }

    public List<String> getJutsu() {
        return jutsu;
    }

    public void setJutsu(List<String> jutsu) {
        this.jutsu = jutsu;
    }

    public Debut getDebut() {
        return debut;
    }

    public void setDebut(Debut debut) {
        this.debut = debut;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }
}
