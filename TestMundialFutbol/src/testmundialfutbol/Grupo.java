package testmundialfutbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grupo extends EtapaMundial {
     List<Equipo> ekipoquepaso = new ArrayList();
     
        private int punto(){
            
         
          
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
