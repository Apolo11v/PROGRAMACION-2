package laboratorio2;
public class Principal {
    public static void main(String[] args) {
        
        MiPunto p1 = new MiPunto(); // (0,0)
        MiPunto p2 = new MiPunto(10, 30.5);
        System.out.println("EJERCICIO 1");
        System.out.println("Distancia: " + p1.distacia(p2));
        System.out.println("");
        System.out.println("EJERCICIO 2");
        System.out.println("-------------------------------------------------------------------------");
        AlgebraVectorial v1 = new AlgebraVectorial(3, 4);
        AlgebraVectorial v2 = new AlgebraVectorial(-4, 3);

        System.out.println("v1 = (" + v1.getX() + ", " + v1.getY() + ")");
        System.out.println("v2 = (" + v2.getX() + ", " + v2.getY() + ")");

        System.out.println("Producto punto: " + v1.productoPunto(v2));
        System.out.println("Magnitud v1: " + v1.magnitud());
        System.out.println("Perpendiculares?: " + v1.esPerpendicular(v2));
        System.out.println("Paralelos?: " + v1.esParalelo(v2));

        AlgebraVectorial proy = v1.proyeccion(v2);
        System.out.println("Proyección de v1 sobre v2: (" + proy.getX() + ", " + proy.getY() + ")");

        System.out.println("Componente de v1 en v2: " + v1.componente(v2));
        
        System.out.println("");
        System.out.println("EJERCICIO 3");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Vector3D vec1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vec2 = new Vector3D(4.0, 5.0, 6.0);

        System.out.println("vec1 = " + vec1);
        System.out.println("vec2 = " + vec2);

        System.out.println("Suma: " + vec1.sumar(vec2));
        System.out.println("Multiplicacion (2 * v1): " + vec1.multiplicar(2));
        System.out.println("Magnitud de v1: " + vec1.magnitud());
        System.out.println("Normal de v1: " + vec1.normal());
        System.out.println("Producto escalar: " + vec1.productoEscalar(vec2));
        System.out.println("Producto vectorial: " + vec1.productoVectorial(vec2));
    }
    
}
