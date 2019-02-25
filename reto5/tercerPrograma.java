package reto5;
import java.util.Scanner;

public class tercerPrograma {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ladoA, ladoB, hipotenusa;
        System.out.println("Ingrese el valor del lado A: ");
        ladoA = sc.nextDouble();
        System.out.println("Ingrese el valor del lado B: ");
        ladoB = sc.nextDouble();
        hipotenusa = CalcularHipotenusa(ladoA, ladoB);
        System.out.println("El valor de hipotenusa es "+ hipotenusa);
        
        
    }

    private static double CalcularHipotenusa(double ladoA, double ladoB) {
        return Math.sqrt(ladoA * ladoA + ladoB * ladoB);
    }
    
}
