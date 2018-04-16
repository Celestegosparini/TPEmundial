
package testmundialfutbol;



public class Resultado {
    
    private int golesLocal;
    private int golesVisitante;
    
    
      public Resultado(){
            
          
        
} 
  
      public int getGolesLocal() {
        return this.golesLocal;
    }
    
    public int getGolesVisitante() {
        return this.golesVisitante;
    }
    public void setResultado(int golesLocal, int golesVisitante){
    this.golesLocal = golesLocal;
    this.golesVisitante = golesVisitante;
    }
  
       
    public boolean ganoLocal() {
        //esta funcion considera que si golesLocal gana arroja un true, por descarte false
        if (this.golesLocal > this.golesVisitante) {
            return true;
        }
        return false;
    }
    
    public boolean empate() {
         //esta funcion considera que si empataron arroja un true, por descarte false
         if (this.golesLocal == this.golesVisitante) {
             return true;
         }
         return false;
    }
    
    
    
}
