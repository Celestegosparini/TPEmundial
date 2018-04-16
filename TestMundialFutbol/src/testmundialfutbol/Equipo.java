package testmundialfutbol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Partido> partidosJugados = new ArrayList();
    private int golesdelotoreqipo;
    private int golesafavor;
    private int diferenciadegoles;

    public int getDiferenciadediferenciagoles() {
        if (this.golesafavor > this.golesdelotoreqipo) {
            this.diferenciadegoles = this.golesafavor - this.golesdelotoreqipo;
        } else if (this.golesdelotoreqipo >= this.golesafavor) {
            this.diferenciadegoles = this.golesdelotoreqipo - this.golesafavor;
        }

        return this.diferenciadegoles;
    }

    public void setDiferenciadediferenciagoles(int diferenciadegoles) {
        this.diferenciadegoles = diferenciadegoles;
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

    public int getGolesaFavor() {
        return golesafavor;
    }

    public void setGolesaFavor(int golesafavor) {
        this.golesafavor = golesafavor;
    }

    public int getGolesdelotoreqipo() {
        return golesdelotoreqipo;
    }

    public void setGolesdelotoreqipo(int golesdelotoreqipo) {
        this.golesdelotoreqipo = golesdelotoreqipo;
    }

//no se como desarrollas esta parte me complica en Interate y aun no pse los puntos
    public Equipo(Resultado resultado, int golesLocal, int golesVisitante) {
        resultado.setResultado(golesLocal, golesVisitante);
    }

}
