package testmundialfutbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grupo extends EtapaMundial {
            
    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> niupi = new ArrayList<>();
        for (Iterator<Partido> iter = super.getPartidos().iterator(); iter.hasNext();) {
            Partido tenkai = iter.next();
            if (tenkai.getResultado().ganoLocal()) {
                niupi.add(tenkai.getLocal());
            }
            if (!tenkai.getResultado().ganoLocal() && !tenkai.getResultado().empate()) {
                niupi.add(tenkai.getVisitante());
            }
        }

        return niupi;
    }

}
