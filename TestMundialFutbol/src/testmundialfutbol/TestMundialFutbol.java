package testmundialfutbol;

import java.util.Date;



public class TestMundialFutbol {

    public static void main(String[] args) {
// seteo nombre de equipo
        Equipo ALocal= new Equipo("Niupi");
      
        Equipo BVisitante = new Equipo("Shutetsu");
    
        Equipo CLocal = new Equipo("Furano");
     
        Equipo Dvisititante = new Equipo("Toho");
       
//   creo  PARTIDO 
        Partido priPar = new Partido(new Date(2,4,18),ALocal,BVisitante);
        
        
        Partido dosPar = new Partido(new Date(3,4,18), CLocal, Dvisititante);
        
        
        
        
        
     
    
    
    
    }

}
