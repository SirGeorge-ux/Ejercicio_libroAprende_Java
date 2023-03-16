package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT4_09_ecuacionSegundoGrado {

    public static void main(String[] args) {
        /*Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).*/

        Scanner sc = new Scanner(System.in);
        // Pedir al usuario los coeficientes
        System.out.print("Ingrese el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        double c = sc.nextDouble();

        // Calcular las soluciones
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        // Mostrar las soluciones
        System.out.println("Las soluciones son:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
