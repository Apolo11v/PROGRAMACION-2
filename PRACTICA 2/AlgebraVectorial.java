package laboratorio2;
public class AlgebraVectorial {
    private double x;
    private double y;

    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    

    public double productoPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y);
    }

    // Perpendicular (a·b = 0)
    public boolean esPerpendicular(AlgebraVectorial v) {
        return this.productoPunto(v) == 0;
    }

    // Paralelo (a = r*b)
    public boolean esParalelo(AlgebraVectorial v) {
        return (this.x * v.y - this.y * v.x) == 0;
    }

    // Proyección
    public AlgebraVectorial proyeccion(AlgebraVectorial v) {
        double escalar = this.productoPunto(v) / Math.pow(v.magnitud(), 2);
        return new AlgebraVectorial(escalar * v.x, escalar * v.y);
    }

    // Componente
    public double componente(AlgebraVectorial v) {
        return this.productoPunto(v) / v.magnitud();
    }
}
    

