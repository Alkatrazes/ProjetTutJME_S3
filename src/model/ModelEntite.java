package model;

/**
 * Created by raphael on 11/11/16.
 */
public class ModelEntite {

    protected int vie;
    protected int niveau;
    /*protected enum Genre {
        HOMME(),
        FEMMME,
        NONDEF();
    }*/
    protected String nom;

    ModelEntite(String nom){
        vie = 150;
        niveau = 1;
        //Genre genre = Genre.NONDEF;
        this.nom = nom;
    }

    ModelEntite(int vie, int niveau, /*Genre genre,*/ String nom){
        this.vie = vie;
        this.niveau= niveau;
        //Genre genre = genre;
        this.nom = nom;
    }

    void setVie(int vie){
        this.vie = vie;
    }

    void setNiveau(int niveau){
        this.niveau = niveau;
    }

    /*void setGenre(){

    }*/

    void setNom(String nom){
        this.nom = nom;
    }

    int getVie(){
        return vie;
    }

    int getNiveau(){
        return niveau;
    }

    String getNom(){
        return nom;
    }

    public void gainNiveau(){
        niveau++;

        if((vie / 2) % 2 != 0){
            vie = vie + vie/2 + 1;
        }
        else{
            vie = vie + vie/2;
        }
    }
}
