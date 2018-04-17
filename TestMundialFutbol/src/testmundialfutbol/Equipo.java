package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Partido> partidosJugados;

    public Equipo() { 
        this.nombre = "";
        this.partidosJugados = new ArrayList();
    }
    
    public Equipo (String nombre){
    this.nombre = nombre;
     this. partidosJugados = new ArrayList();
    }

    public int getDiferenciadediferenciagoles() {
        //Declaro variables locales que utilizare es en metodo
        int golesdelotoreqipo = 0;
        int golesafavor = 0;
        int diferenciadegoles = 0;
        //el for each recorre la lista de partidosJugados y lo retorna en tenkai
        for (Partido tenkai : this.partidosJugados) {
            // si los goles que converti son mayores los que me conbirtieron hago la diferencia de goles
            if (golesafavor > golesdelotoreqipo) {
                diferenciadegoles = golesafavor - golesdelotoreqipo;
         // esto es para salvaguardar resutados negativo o 0
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

    void setNombre(String string) {
       this.nombre = nombre;
    }

    

   

    

}
