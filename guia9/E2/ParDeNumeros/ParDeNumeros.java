/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos n�meros reales con los cuales se realizar�n diferentes operaciones matem�ticas. La clase debe tener un constructor vac�o, getters y setters.  En el constructor vac�o se usar� el Math.random para generar los dos n�meros.
 */
package guia9.E2.ParDeNumeros;


public class ParDeNumeros {
    
    private double num1;
    private double num2;

    public ParDeNumeros() {
        
        
        this.num1 = Math.random()*(100);
        this.num2 = Math.round(((Math.random()*(100))*100d)/100);
        
        
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
    
}
