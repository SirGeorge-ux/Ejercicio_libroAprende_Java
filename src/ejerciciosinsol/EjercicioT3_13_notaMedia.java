package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT3_13_notaMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = sc.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double mediaDeseada = sc.nextDouble();

        double nota2 = (mediaDeseada - (nota1 * 0.4)) / 0.6;

        System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un %.1f en el segundo examen.\n", mediaDeseada, nota2);
    }
}

