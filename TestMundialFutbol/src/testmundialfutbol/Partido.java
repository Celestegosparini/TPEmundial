
package testmundialfutbol;

import java.util.Date;



public class Partido {
    
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    
    public Partido(Date fecha, Equipo local, Equipo visitante,int golesLocal, int golesVisitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.resultado.setResultado(golesLocal, golesVisitante);
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
