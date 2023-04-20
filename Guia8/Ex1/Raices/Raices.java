/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuaci�n de 2� grado. Tendremos los 3 coeficientes como atributos, llam�mosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a trav�s de un m�todo constructor. Luego, en RaicesServicio las operaciones que se podr�n realizar son las siguientes:
 */
package Guia8.Ex1.Raices;


public class Raices {
    double a;
    double b;
    double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
  
}
