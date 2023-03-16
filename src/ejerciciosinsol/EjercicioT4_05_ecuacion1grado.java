
package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT4_05_ecuacion1grado {
    public static void main(String[] args) {
        /*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0) */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Queremos depejar la x de una ecuacion, asi que introduzca la ecuacion de primer grado");
        
        System.out.printf("Introduzca un numero: ");
        int b = sc.nextInt();
        
        System.out.printf("Introduzca otro numero: ");
        int c = sc.nextInt();
       
        int r = (c - b)/2;
        System.out.println("Con los digitos introducido la ecuacion seria ax + "+b+" = "+c+"\nLa incognita seria: "+r);
        
    }
}
