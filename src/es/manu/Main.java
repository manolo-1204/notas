package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero, notas, aprobados = 0, suspensos = 0, suma = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas notas quieres introducir? ");
        notas = entrada.nextInt();

        for (int i = 1; i <= notas; i ++) {
            do {
                System.out.print("Nota " + i + ": ");
                numero = entrada.nextInt();
            } while (numero < 0 || numero > 10);

            if (numero >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            suma += numero;
            System.out.println();
        }

        System.out.println("Nº de aprobados: " + aprobados);
        System.out.println("Nº de suspensos: " + suspensos);
        System.out.println("Media: " + (float) suma / notas);
    }
}