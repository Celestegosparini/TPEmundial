package testmundialfutbol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Equipo {

    private String nombre;
    private List<Partido> partidosJugados = new ArrayList();
//no se como desarrollas esta parte me complica en Interate y aun no pse los puntos
    public Equipo(Resultado resultado, int golesLocal, int golesVisitante) {
        resultado.setResultado(golesLocal, golesVisitante);
    }

    public String getNombre() {
        return this.nombre;
    }

   

}
