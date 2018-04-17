package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

public abstract class EtapaMundial {

    private String descripcionEtapa;
    List<Partido> partidos;

    public void EtapaMundial() {
        this.descripcionEtapa = "";
        this.partidos = new ArrayList<>();
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
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
