package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT4_07_08_notasMedia {

    public static void main(String[] args) {
        /* Realiza un programa que calcule la media de tres notas. */

        Scanner sc = new Scanner(System.in);

        System.out.printf("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.printf("Nota 3: ");
        double nota3 = sc.nextDouble();

        double resultado = (nota1 + nota2 + nota3) / 3;

        if ((resultado >= 5) && (resultado <= 6)) {
            System.out.println("Suficiente");
        } else if ((resultado >= 6) && (resultado <= 8)) {
            System.out.println("Bien");
        } else if ((resultado >= 8) && (resultado <= 9.9)) {
            System.out.println("Notable");
        } else if (resultado == 10) {
            System.out.println("Sobresaliente");
        } else if (resultado < 5) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Parametro errorneo");
        }

        System.out.printf("La media de las 3 notas es: %.2f %n", resultado);
    }
}
