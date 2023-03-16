package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT4_04_calculaHorasTrabajo {

    public static void main(String[] args) {
        /* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
        las horas extras. Escribe un programa que calcule el salario semanal de un
        trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
        trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos dias de la semana has trabajado: ");
        int diasTrabajados = sc.nextInt();

        System.out.println("Cuantas horas extras:");
        int horasExtras = sc.nextInt();

        int horasOrdinarias = diasTrabajados * 8;
        int sueldOrdinario = horasOrdinarias * 12;

        int sueldoExtra = horasExtras * 16;
        int total = sueldOrdinario + sueldoExtra;

        System.out.println("Cobraras un total de " + total + "\nHoras Extras: " + sueldoExtra + "\nSalario semanal: " + sueldOrdinario);
    }
}
