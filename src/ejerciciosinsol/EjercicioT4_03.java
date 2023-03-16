package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT4_03 {

    public static void main(String[] args) {
        /* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero del 1 al 7; ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 -> {
                System.out.println("Lunes");
            }
            case 2 -> {
                System.out.println("Martes");
            }
            case 3 -> {
                System.out.println("Miercoles");
            }
            case 4 -> {
                System.out.println("Jueves");
            }
            case 5 -> {
                System.out.println("Viernes");
            }
            case 6 -> {
                System.out.println("Sabado");
            }
            case 7 -> {
                System.out.println("Domingo");
            }
            default -> System.out.println("El rango tiene q ser del 1 al 7 y numerico");
            }
        }
    }

