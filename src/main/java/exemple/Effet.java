package exemple;

import bandeau.Bandeau;

public abstract class Effet {
    private String texte;

    //constructeur 
    public Effet(String t) {
        this.texte = t;
    }

    //getteur
    public String getTexte(){ return this.texte;}

    //classe abtraite permettant de définir les effets en cours
    public abstract void lancement(Bandeau bandeau);
 
}

