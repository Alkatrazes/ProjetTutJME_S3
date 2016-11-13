package model;

/**
 * Created by raphael on 13/11/16.
 */
public class ModelPnj extends ModelEntite{

    ModelPnj(String nom){
        super(nom);
    }

    ModelPnj(int vie, int niveau, String nom){
        super(vie,niveau,nom);
    }
}
