/*Crear una clase Rect�ngulo que modele rect�ngulos por medio de un atributo privado base y un atributo privado altura. La clase incluir� un m�todo para crear el rect�ngulo con los datos del Rect�ngulo dados por el usuario. Tambi�n incluir� un m�todo para calcular la superficie del rect�ngulo y un m�todo para calcular el per�metro del rect�ngulo. Por �ltimo, tendremos un m�todo que dibujar� el rect�ngulo mediante asteriscos usando la base y la altura. Se deber�n adem�s definir los m�todos getters, setters y constructores correspondientes.
Superficie = base * altura / Per�metro = (base + altura) * 2. */
package Guia7.E4;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void datos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        int num1 = input.nextInt();
        setBase(num1);
        System.out.println("Ingrese la altura del rectangulo");
        int num2 = input.nextInt();
        setAltura(num2);

    }

    public int superficie() {
        return this.base * this.altura;
    }

    public int perimetro() {
        return (this.base + this.altura) * 2;
    }

    public void dibujar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                if ((i != 0) && (i != altura - 1)) {
                    if ((j != 0) && (j != base - 1)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println("");
        }
    }
}
