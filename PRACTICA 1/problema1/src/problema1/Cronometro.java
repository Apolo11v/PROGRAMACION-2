package problema1;
public class Cronometro {
    private long inicia;
    private long finaliza;

    public Cronometro() {
        
    }
    
    public void inicia(){
        inicia = System.currentTimeMillis();
    }
    
    public void detener(){
        finaliza = System.currentTimeMillis();
    }
    public long lapsoDeTiempo(){
        return inicia - finaliza;
    }

    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }
    
    
    
    
}
