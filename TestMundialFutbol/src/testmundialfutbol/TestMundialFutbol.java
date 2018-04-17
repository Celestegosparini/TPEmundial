package testmundialfutbol;

import java.util.Date;

public class TestMundialFutbol {

    public static void main(String[] args) {
// seteo nombre de equipo
        Equipo ALocal = new Equipo("Niupi");
        System.out.println(ALocal.getNombre());

        Equipo BVisitante = new Equipo("Shutetsu");
        System.out.println(BVisitante.getNombre());
        Equipo CLocal = new Equipo("Furano");
        System.out.println(CLocal.getNombre());

        Equipo Dvisititante = new Equipo("Toho");
        System.out.println(Dvisititante.getNombre());

//   creo  PARTIDOs y asigno resultados 
        Partido priPar = new Partido(new Date(2, 4, 18), ALocal, BVisitante);
        Resultado priParResu = new Resultado();
        priParResu.setResultado(3, 2);
        priPar.setResultado(priParResu);    
        Partido dosPar = new Partido(new Date(3, 4, 18), CLocal, Dvisititante);
        Resultado dosParResu = new Resultado();
        dosParResu.setResultado(4, 5);
        
      
    }

}
