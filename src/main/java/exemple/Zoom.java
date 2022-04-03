package exemple;

import bandeau.Bandeau;
import java.awt.*;

public class Zoom extends Effet {

//constructeur 
    public Zoom() {
        super("Effet de Zoom");
    }
    
//action de l'effet
    @Override
    public void lancement(Bandeau bandeau) {
        bandeau.setMessage(this.getTexte());
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
    }
    
}
