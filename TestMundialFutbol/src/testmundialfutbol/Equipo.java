package testmundialfutbol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Partido> partidosJugados = new ArrayList();
    
   

    public int getDiferenciadediferenciagoles() {
        int golesdelotoreqipo = 0;
        int golesafavor =0;
        int diferenciadegoles = 0;

        for (Partido tenkai : this.partidosJugados) {
            if (golesafavor > golesdelotoreqipo) {
             diferenciadegoles = golesafavor - golesdelotoreqipo;
            } else if (golesdelotoreqipo >= golesafavor) {
                diferenciadegoles = golesdelotoreqipo - golesafavor;
            }
        }
        return diferenciadegoles;
    }

    public void setDiferenciadediferenciagoles(int diferenciadegoles) {
       diferenciadegoles = diferenciadegoles;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(List<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
//no se como desarrollas esta parte me complica en Interate y aun no pse los puntos
    public Equipo(Resultado resultado, int golesLocal, int golesVisitante) {
        resultado.setResultado(golesLocal, golesVisitante);
    }

}
