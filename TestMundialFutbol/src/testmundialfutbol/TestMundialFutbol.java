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
        Partido priPar = new Partido(new Date(), ALocal, BVisitante);
        Partido dosPar = new Partido(new Date(), CLocal, Dvisititante);
        
        System.out.println(priPar);
        Resultado priParResu = new Resultado();
        priParResu.setResultado(3, 2);
        priPar.setResultado(priParResu);  
        Resultado dosParResu = new Resultado();
        dosParResu.setResultado(4, 5);
        dosPar.setResultado(dosParResu);
      
    }

}
