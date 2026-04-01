package laboratorio2;
public class MiPunto {
    private double x;
    private double y;

    public MiPunto() {
        this.x= 0;
        this.y= 0;
    }

    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    // MiPunto esta pasando un objeto la clase Mipunto 
    public double distacia(MiPunto p ){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        
    } 
    
    public double distacia(double x,double y){
      return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));  
    }
}
