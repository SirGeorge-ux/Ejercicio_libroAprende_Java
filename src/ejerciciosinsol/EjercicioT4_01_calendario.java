
package ejerciciosinsol;

import java.util.Scanner;

public class EjercicioT4_01_calendario {
    public static void main(String[] args) {
/*Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.*/
        
        Scanner sc = new Scanner(System.in);
        
        String lunes, martes, miercoles, jueves, viernes, sabado, domingo;
        
        System.out.println("Escriba el dia de la semana: ");
        String dia = sc.next();
        
        switch (dia) {
            case "lunes" -> {
                System.out.printf("Lunes tienes 6 horas de clase.\nQue hora quieres saber que te toca: ");
                int hora = sc.nextInt();
                
                switch(hora){
                    case 1 -> {
                        System.out.println("Programacion");
                    }
                    case 2 -> {
                        System.out.println("Algoritmia");
                    }
                    case 3 -> {
                        System.out.println("Patrones de diseño");
                    }
                    case 4 -> {
                        System.out.println("Diseño de interface");
                    }
                    case 5 -> {
                        System.out.println("Bases de datos");
                    }
                    case 6 -> {
                        System.out.println("Sistemas informaticos");
                    }
                }
            }
            case "martes" -> {
                System.out.println("Martes tienes 6 horas de clase.\nQue hora quieres saber que te toca: ");
                int hora = sc.nextInt();
                
                switch(hora){
                    case 1 -> {
                        System.out.println("Bases de datos");
                    }
                    case 2 -> {
                        System.out.println("Algoritmia");
                    }
                    case 3 -> {
                        System.out.println("Patrones de diseño");
                    }
                    case 4 -> {
                        System.out.println("Diseño de interface");
                    }
                    case 5 -> {
                        System.out.println("Programacion");
                    }
                    case 6 -> {
                        System.out.println("Sistemas informaticos");
                    }
                }         
            }
            case "miercoles" -> {
                System.out.println("Miercoles tienes 6 horas de clase.\nQue hora quieres saber que te toca: ");
                int hora = sc.nextInt();
                
                switch(hora){
                    case 1 -> {
                        System.out.println("Bases de datos");
                    }
                    case 2 -> {
                        System.out.println("Algoritmia");
                    }
                    case 3 -> {
                        System.out.println("Patrones de diseño");
                    }
                    case 4 -> {
                        System.out.println("Diseño de interface");
                    }
                    case 5 -> {
                        System.out.println("Programacion");
                    }
                    case 6 -> {
                        System.out.println("Sistemas informaticos");
                    }
                }
            }
            case "jueves" -> {
                System.out.println("Jueves tienes 6 horas de clase.\nQue hora quieres saber que te toca: ");
                int hora = sc.nextInt();
                
                switch(hora){
                    case 1 -> {
                        System.out.println("Patrones de diseño");
                    }
                    case 2 -> {
                        System.out.println("Algoritmia");
                    }
                    case 3 -> {
                        System.out.println("Programacion");
                    }
                    case 4 -> {
                        System.out.println("Diseño de interface");
                    }
                    case 5 -> {
                        System.out.println("Bases de datos");
                    }
                    case 6 -> {
                        System.out.println("Sistemas informaticos");
                    }
                }
            }
            case "viernes" -> {
                System.out.println("Viernes tienes 6 horas de clase.\nQue hora quieres saber que te toca: ");
                int hora = sc.nextInt();
                
                switch(hora){
                    case 1 -> {
                        System.out.println("Algoritmia");
                    }
                    case 2 -> {
                        System.out.println("Programacion");
                    }
                    case 3 -> {
                        System.out.println("Patrones de diseño");
                    }
                    case 4 -> {
                        System.out.println("Diseño de interface");
                    }
                    case 5 -> {
                        System.out.println("Bases de datos");
                    }
                    case 6 -> {
                        System.out.println("Sistemas informaticos");
                    }
                }
            }
            case "sabado" -> {
                System.out.println("El sabado no ahi clase");
            }
            case "domingo" -> {
                System.out.println("El domingo no ahi clase");
            }
            default ->
                System.out.println("Este dia no tienes clase");
        }
    
    }
}
