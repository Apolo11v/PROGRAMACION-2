package problema2;

import java.util.Scanner;
public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a b c d e f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        Algebra e1 = new Algebra(a,b,c,d,e,f);

        if(e1.tieneSolucion()) {
            System.out.println("x = " + e1.getX() + " y = " + e1.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
    }
    
}
