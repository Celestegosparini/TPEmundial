package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;


public abstract class EtapaMundial {

    private String descripcionEtapa;
    private List<Partido> partidos;

    public void EtapaMundial(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
        this.partidos = new ArrayList<>();
    }

    public String getDescripcionEtapa() {
        return this.descripcionEtapa;
    }

    public void addPartido(Partido p) {
        this.partidos.add(p);
    }

    protected List<Partido> getPartidos() {
        return this.partidos;
    }

    public abstract List<Equipo> getEquiposQueAvanzan();

}
