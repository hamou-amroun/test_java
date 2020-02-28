package exo2;

import java.io.Serializable;

public class Alex implements Serializable {

    private static final long serialVersionUID = 1350092881346723523L;

    private String nom, prenom;

    private int salaire;

    public Alex(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        return sb.append(nom).append(" ").append(prenom).toString();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
