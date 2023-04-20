//Crea una clase "Juego" que tenga un m�todo "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de n�meros. El primer jugador elige un n�mero y el segundo jugador intenta adivinarlo. El segundo jugador tiene un n�mero limitado de intentos y recibe una pista de "m�s alto" o "m�s bajo" despu�s de cada intento. El juego termina cuando el segundo jugador adivina el n�mero o se queda sin intentos. Registra el n�mero de intentos necesarios para adivinar el n�mero y el n�mero de veces que cada jugador ha ganado.
package Guia7.Ex3;

import java.util.Scanner;

public class Juego {

    private int num1;
    private int num2;
    private int intentos;
    private int gnum1;
    private int gnum2;

    public Juego() {
    }

    public Juego(int num1) {
        this.num1 = num1;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void iniciarjuego() {

        String op;

        do {

            boolean salir = false;
            this.intentos = 5;
            int veces = 0;

            do {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese un n�mero a Advinar, entre 1 y 100");
                int num = input.nextInt();
                setNum1(num);
            } while (this.num1 > 100 || this.num1 < 0);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            do {

                do {
                    Scanner input = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("Ingrese el n�mero a advinar, entre 1 y 100. Tiene " + this.intentos + " intentos");
                    int numa = input.nextInt();
                    setNum2(numa);
                    veces++;
                } while (this.num2 > 100 || this.num2 < 0);

                if (this.num2 > this.num1) {
                    System.out.println("El n�mero es mayor que el n�mero a advinar.");
                    this.intentos--;
                }

                if (this.num2 < this.num1) {
                    System.out.println("El n�mero es menor que el n�mero a advinar");
                    this.intentos--;
                }

                if (this.num2 == this.num1) {
                    System.out.println("USTED HA GANADO!! ha usado " + veces + " intentos");
                    this.gnum2++;
                    salir = true;
                }

                if (this.intentos == 0) {
                    System.out.println("USTED PERDIO! Se ha quedado sin intentos.");
                    this.gnum1++;
                    salir = true;
                }

            } while (salir != true);

            do {
                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.println("Desea seguir jugando?\n Para seguir ingrese S/s, para terminar N/n ");
                op = input.next();
            } while (!"s".equalsIgnoreCase(op) && !"n".equalsIgnoreCase(op));

        } while (!"n".equalsIgnoreCase(op));

        System.out.println("");
        System.out.println("El jugador 1 ha ganado " + gnum1 + " veces");
        System.out.println("El jugador 2 ha ganado " + gnum2 + " veces");
    }

}
