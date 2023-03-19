package com.example.myapplication;

public class Pokemon {
    private int id;
    private String image;
    private String weight;
    private String nom;
    private String cat;
    private String gender;

    public String getImage() {
        return image;
    }


    public Pokemon(int id, String image, String weight, String nom, String cat, String gender) {
        this.id = id;
        this.image = image;
        this.weight = weight;
        this.nom = nom;
        this.cat = cat;
        this.gender = gender;
    }

    public String getCat() {
        return cat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                '}';
    }
}



