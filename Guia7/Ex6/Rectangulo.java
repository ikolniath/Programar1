//Crea una clase "Rect�ngulo" que tenga atributos "lado1" y "lado2" y un m�todo "calcular_area" que calcule y devuelva el �rea del rect�ngulo. Luego crea un objeto "rectangulo1" de la clase "Rect�ngulo" con lados de 4 y 6 y imprime el �rea del rect�ngulo.

package Guia7.Ex6;

public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2; 
    }

    public Rectangulo() {
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public int Calcular_area(){
        
        return this.lado1*this.lado2;
        
    }
           
}
