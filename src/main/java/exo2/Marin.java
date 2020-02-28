package exo2;

import java.io.Serializable;

public class Marin implements Serializable {

    private static final long serialVersionUID = 1350092881346723535L;

    private String nom, prenom;

    private int salaire;

    private Alex alex;

    public Marin(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        return sb.append(nom).append(" ").append(prenom).append(" ").append(alex).toString();
    }

    public void setAlex(Alex alex) {
        this.alex = alex;
    }
}