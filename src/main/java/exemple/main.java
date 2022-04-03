package exemple;
import bandeau.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        new main().test();
    }
    public void test(){
        Bandeau bandeau1 = new Bandeau();
        Zoom zoom = new Zoom();
        Rotation spin = new Rotation();
        Couleur color = new Couleur();
        Scenario scene1 = new Scenario();
        scene1.ajoutEffet(bandeau1, spin, 2);
        scene1.ajoutEffet(bandeau1, zoom, 3);
        scene1.ajoutEffet(bandeau1, color, 1);
        scene1.StartScenario(bandeau1);

    }
}
