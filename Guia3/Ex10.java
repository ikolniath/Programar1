//Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
package Guia3;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        int num = 0;
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int respuesta = num1 * num2;

        //System.out.println(respuesta);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Adivine el número!! El número a adivinar es la multiplicación de dos números entre 0 y 10");
            System.out.println("Ingrese el número");
            num = input.nextInt();

            if (num == respuesta) {
                System.out.println("Felicidades!! USTED ADIVINO !!!");
                System.out.println("");
            } else {
                System.out.println("Número incorrecto, intente de nuevo!!!");
                System.out.println("");
            }

        } while (num != respuesta);

    }

}
