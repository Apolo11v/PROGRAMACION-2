package problema1;
public class Cronometro {
    private int inicia;
    private int finaliza;

    public Cronometro() {
        inicia = (int) System.currentTimeMillis();
    }

    public void inicia() {
        inicia = (int) System.currentTimeMillis();
    }

    public void detener() {
        finaliza = (int) System.currentTimeMillis();
    }

    public int lapsoDeTiempo() {
        return finaliza - inicia;
    }

    public int getInicia() {
        return inicia;
    }

    public int getFinaliza() {
        return finaliza;
    }
    
    
}
