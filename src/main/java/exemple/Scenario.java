package exemple;

import java.util.*;
import bandeau.*;

public class Scenario {
    private List<Effet> listEffet = new ArrayList<Effet>();

    public void StartScenario(Bandeau bandeau){
        for(Effet e : listEffet){
            e.lancement(bandeau);
        }
    }

    public void ajoutEffet(Bandeau bandeau, Effet effet, int repet){
        for(int i = 1; i <= repet; i++){
            this.listEffet.add(effet);
        }
    }


}
