package laboratorio2;
public class Vector3D {
    private double x, y, z;
    
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Suma
    public Vector3D sumar(Vector3D v) {
        return new Vector3D(x + v.x, y + v.y, z + v.z);
    }
    // Multiplicación por escalar
    public Vector3D multiplicar(double r) {
        return new Vector3D(r * x, r * y, r * z);
    }
    // Magnitud
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    // Normal
    public Vector3D normal() {
        double m = magnitud();
        return new Vector3D(x/m, y/m, z/m);
    }

    // Producto escalar
    public double productoEscalar(Vector3D v) {
        return x*v.x + y*v.y + z*v.z;
    }
    // Producto vectorial
    public Vector3D productoVectorial(Vector3D v) {
        return new Vector3D(
            y*v.z - z*v.y,
            z*v.x - x*v.z,
            x*v.y - y*v.x
        );
    }

    @Override
    public String toString() {
        return "Vector3D{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
}
