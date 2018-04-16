package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Llave extends EtapaMundial {

    @Override
//no me sale esto 
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> shutetsu = new ArrayList<>();
        for (Iterator<Equipo> iter = super.getPartidos().iterator() iter.hasNext();) {
            Equipo tenkai = iter.next();
            if (tenkai.getResultado().ganoLocal()) {
                shutetsu.add(tenkai.getLocal());
            }
            if (!tenkai.getResultado().ganoLocal() && !tenkai.getResultado().empate()) {
                shutetsu.add(tenkai.getVisitante());
            }
        }

        return shutetsu;
    }

}
