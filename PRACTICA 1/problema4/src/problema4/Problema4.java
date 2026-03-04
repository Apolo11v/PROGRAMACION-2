package problema4;
import java.util.Scanner;
public class Problema4 {
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese datos de entrada:");
        double[] datos = new double[10];

        for(int i=0;i<10;i++){
            datos[i] = sc.nextDouble();
        }

        Estadisticas e = new Estadisticas(datos);
        System.out.println("Promedio: " + e.promedio());
        System.out.println("Desviacion: " + e.desviacion());
    }
    
}
