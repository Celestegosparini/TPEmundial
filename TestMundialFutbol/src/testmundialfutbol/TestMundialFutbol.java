package testmundialfutbol;

import java.util.Date;



public class TestMundialFutbol {

    public static void main(String[] args) {
// seteo nombre de equipo
        Equipo A = new Equipo();
        A.setNombre("Niupi");
        Equipo B = new Equipo();
        B.setNombre("Shutetsu");
        Equipo C = new Equipo();
        C.setNombre("Furano");
        Equipo D = new Equipo();
        D.setNombre("Toho");
       
//        creo el primer PARTIDO 
        Partido priPar = new Partido(new Date (),A,B);
        Partido dosPar = new Partido(new Date(), C, D);
        
        
        
        
        
     
    
    
    
    }

}
