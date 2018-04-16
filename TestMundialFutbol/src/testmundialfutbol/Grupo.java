package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends EtapaMundial {

    List<Equipo> ekipoquepaso = new ArrayList();

    private int punto(Equipo eki) {
        int puntos = 0;
        for (Partido partidos : eki.getPartidosJugados()) {
            if (partidos.getResultado().ganoLocal() && eki.equals(partidos.getLocal())) {
                puntos += 3;

            }
            if  (partidos.getResultado().ganoVisitante() && eki.equals(partidos.getVisitante())) {
                puntos += 3;
            }
            if (partidos.getResultado().empate()) {
                puntos += 1;
            }
        }
        return puntos;
    }

    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> setsu = new ArrayList<>();
        for (Partido tenkai : super.getPartidos()) {
            if (tenkai.getResultado().ganoLocal()) {
                setsu.add(tenkai.getLocal());
            }
            if (!tenkai.getResultado().ganoLocal() && !tenkai.getResultado().empate()) {
                setsu.add(tenkai.getVisitante());
            }
        }

        return setsu;
    }

}
