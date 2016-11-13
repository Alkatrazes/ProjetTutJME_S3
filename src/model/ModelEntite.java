package model;

/**
 * Created by raphael on 11/11/16.
 */
public class ModelEntite {

    protected int vie;
    protected int niveau;
    protected int vieMax = vie;
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

    public boolean estMort(){
        if(vie <= 0){
            return true;
        }
        return false;
    }

    public void perteVie(int degats){
        vie -= degats;
    }

    public void regenVie(){
        while(vie < vieMax){
            //incrémenter de 1 la vie tout les x secondes
        }
    }

    public void print() {
        if(vie <= 0){
            System.out.println("Le personnage "+nom+" est actuellement mort.");
        }
        else{
            System.out.println("Ce personnage s'apelle "+nom+", il est niveau "+niveau+" et il possede "+vie+" points de vie.");
        }
    }
}
