package exemple;

import bandeau.Bandeau;
import java.awt.*;

public class Couleur extends Effet{

    //constructeur
    public Couleur() {
        super("Effet changement de couleur");
    }
//action de l'effet
    @Override
    public void lancement(Bandeau bandeau) {
        for(int i = 0; i<=5; i++){
        bandeau.setMessage("Changement de couleur");
        bandeau.setBackground(Color.RED);
        bandeau.setForeground(Color.yellow);
        bandeau.sleep(100);
        bandeau.setBackground(Color.LIGHT_GRAY);
        bandeau.setForeground(Color.BLACK);
        bandeau.sleep(100);
        }
    }
    
}
