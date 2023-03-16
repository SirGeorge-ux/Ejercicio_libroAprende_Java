package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT4_06_calculaTiempoCaida {

    public static void main(String[] args) {
        /*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
        una altura h. Aplica la fórmula t =√2h/g siendo g = 9:81m/s2 */
        Scanner sc = new Scanner(System.in);

        final double gravedad = 9.8;
     
        System.out.println("Indiquenos la altura que caera el objeto:");
        double altura = sc.nextDouble();

        double tiempo = Math.sqrt((2 * altura) / gravedad);
        System.out.println("El tiempo que tardara en caer el objeto sera: "+tiempo);

    }
}
