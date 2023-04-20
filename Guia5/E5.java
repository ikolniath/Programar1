//Realice un programa que compruebe si una matriz dada es antisim�trica. Se dice que una matriz A es antisim�trica cuando �sta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisim�trica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)
package Guia5;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {

        int[][] vector = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese n�mero");
                vector[i][j] = (input.nextInt());
            }
        }
        int n1 = 0;
        int n2 = 0;
        int aux = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == aux) {
                    n1 += vector[i][j];
                }
                if (i == aux) {
                    n2 += vector[j][i];
                }
            }

            if (Math.abs(n1) - Math.abs(n2) != 0) {
                break;
            } else {
                aux ++;
            }

        }
        System.out.println("");

        if (aux != 3) {
            System.out.println("El cuadro es Antisim�trico");
        } else {
            System.out.println("El cuadro es Sim�trico");
        }
    }
}
