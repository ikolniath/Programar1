//Realizar un algoritmo que llene un vector de tama�o N con valores aleatorios y le pida al usuario un n�mero a buscar en el vector. El programa mostrar� d�nde se encuentra el numero y si se encuentra repetido
package Guia5;

import java.util.Scanner;

public class E2 {


    public static void main(String[] args) {

        int n = (int) (Math.random() * 50);
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 20);
        }

        for (int i: vector) {
            System.out.print(i + " ");
        }
        int num = 0;
        System.out.println("");
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("ingrese un n�mero adivinar entre 1 y 20");
            num = input.nextInt();
        } while ((num > 20) || (num < 0));
        int flag = 0;
        
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                System.out.println("El n�mero se encuentra en la posici�n " + i);
                flag++;
            }
        }

        if (flag == 0) {
            System.out.println("El n�mero no se encuentra");
        }
    }

}
