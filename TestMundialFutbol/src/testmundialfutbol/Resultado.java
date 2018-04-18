package testmundialfutbol;

public class Resultado {

    private int golesLocal;
    private int golesVisitante;

    public Resultado() {

    }

    public int getGolesLocal() {
        return this.golesLocal;
    }

    public int getGolesVisitante() {
        return this.golesVisitante;
    }

    public void setResultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public boolean ganoLocal() {
        // retorn el cuando gana local
         System.out.println("Gano local");
        return this.golesLocal > this.golesVisitante;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean empate() {
        //retorna cuando gana visitante
        System.out.println("Empate");
        return this.golesLocal == this.golesVisitante;
        
    }

    public boolean ganoVisitante() {
        //define empate
         System.out.println("Gano viitante");
        return this.golesVisitante > this.golesLocal;
    }
     @Override
    public String toString() {
        String golesLocales = String.valueOf(golesLocal);
        String golesVisitantes = String.valueOf(golesVisitante);
        return "Puntos: " + golesLocales + "-" + golesVisitantes;
    }
}
