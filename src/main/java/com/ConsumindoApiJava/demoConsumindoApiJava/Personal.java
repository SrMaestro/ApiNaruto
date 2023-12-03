package com.ConsumindoApiJava.demoConsumindoApiJava;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Personal {

    private String sex;
    private String classification;
    private String occupation;
    private List<String> natureType;

    @Override
    public String toString() {
        return "Personal{" +
                "sex='" + sex + '\'' +
                ", classification='" + classification + '\'' +
                ", occupation='" + occupation + '\'' +
                ", affiliation=" +
                '}';
    }

    public List<String> getNatureType() {
        return natureType;
    }

    public void setNatureType(List<String> natureType) {
        this.natureType = natureType;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
