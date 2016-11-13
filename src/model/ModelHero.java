package model;

/**
 * Created by raphael on 11/11/16.
 */
public class ModelHero extends ModelEntite {

    ModelHero(String nom){
        super(nom);
    }

    ModelHero(int vie, int niveau, String nom){
        super(vie,niveau,nom);
    }


}
