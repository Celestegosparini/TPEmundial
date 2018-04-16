package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Llave extends EtapaMundial {

    @Override
//
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> niupi = new ArrayList<>();
        for (Partido tenkai : getPartidos()) {
            if (tenkai.getResultado().ganoLocal()) {
                niupi.add(tenkai.getLocal());
            }
            if (tenkai.getResultado().ganoVisitante()) {
                niupi.add(tenkai.getVisitante());
            }
        }

        return niupi;
    }

}
