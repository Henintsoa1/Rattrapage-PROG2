package org.Todolist.Ys;

public class Appartement {
    public String identifiant;
    public String titre;
    public String description;
    public int loyer;
    public boolean status;

    public Appartement(String identifiant, String titre, String description, int loyer) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.description = description;
        this.loyer = loyer;
    }
    

    public String getIdentifiant() {
        return identifiant;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public int getLoyer() {
        return loyer;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Appartement{" +
                "identifiant='" + identifiant + '\'' +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", loyer=" + loyer +
                ", status=" + status +
                '}';
    }
}
