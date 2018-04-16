package testmundialfutbol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Partido> partidosJugados = new ArrayList();

    public Equipo() {

    }

    public int getDiferenciadediferenciagoles() {
        int golesdelotoreqipo = 0;
        int golesafavor = 0;
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

}
