package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet{

    //constructeur
    public Rotation() {
        super("Effet de Rotation");
    }

//action de l'effet
    @Override
    public void lancement(Bandeau bandeau) {
        bandeau.setMessage(this.getTexte());
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation(2 * Math.PI * i / 100);
            bandeau.sleep(10);
        }
    }
    
}
