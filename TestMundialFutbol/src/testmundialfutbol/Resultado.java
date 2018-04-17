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
        
        return this.golesLocal == this.golesVisitante;
        
    }

    public boolean ganoVisitante() {
        //define empate
        
        return this.golesVisitante > this.golesLocal;
    }

}
