package testmundialfutbol;

import java.util.Date;

public class Partido {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(Equipo local, Equipo visitante) {
         this.local = local;
        this.visitante = visitante;

    }

    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;

    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Resultado getResultado() {
        return this.resultado;
    }

    public Equipo getLocal() {
        return this.local;
    }

    public Equipo getVisitante() {
        return this.visitante;
    }

  

}
