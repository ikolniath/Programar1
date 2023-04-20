/*
M�todo getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente f�rmula: (b^2)-4*a*c
M�todo tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
M�todo tieneRaiz(): devuelve un booleano indicando si tiene una �nica soluci�n, para que esto ocurra, el discriminante debe ser igual que 0.
M�todo obtenerRaices(): llama a tieneRai?ces() y si devolvi�? true, imprime las 2 posibles soluciones.
M�todo obtenerRaiz(): llama a tieneRaiz() y si devolvi�? true imprime una �nica ra�z. Es en el caso en que se tenga una �nica soluci�n posible.
M�todo calcular(): este? m�todo llamara? tieneRaices() y a tieneRai?z(), y mostrara? por pantalla las posibles soluciones que tiene nuestra ecuaci�n con los m�todos obtenerRaices() o obtenerRaiz(), seg�n lo que devuelvan nuestros m�todos y en caso de no existir soluci�n, se mostrara? un mensaje.
 */
package Guia8.Ex1.RaicesServicio;

import Guia8.Ex1.Raices.Raices;
import java.util.Scanner;

public class RaicesServicio {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Raices num(){
        
        System.out.println("Ingrese el n�mero A");
        double numa = input.nextDouble();
        
        System.out.println("Ingrese el n�mero A");
        double numb = input.nextDouble();
        
        System.out.println("Ingrese el n�mero A");
        double numc = input.nextDouble();
        
        return new Raices(numa, numb, numc);
        
    }
    
    
    public double getDiscriminante(Raices X){
        
       double Dis = (Math.pow(X.getB(), 2))-(4*X.getA()*X.getC());       
       return Dis;
       
       
    }    
    
    public boolean tienesRaices(Double getDiscriminante){
        
        return getDiscriminante >= 0;
          
    }
    
     public boolean tienesRaiz(Double getDiscriminante){
        
        return getDiscriminante == 0;
          
    }
     
//     public double obtenerRaices(boolean tieneRaices, Raices X){
//         double num1 = 0;
//         double num2 = 0;
//         
//         if (tieneRaices){
//             num1 = ((-(X.getB())) - Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
//             num2 = ((-(X.getB())) + Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
//         }
//         
//         return num1;   
//     }
     
     
     
         public void obtenerRaices(Raices X){
         
         
            double num1 = ((-(X.getB())) - Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
            double num2 = ((-(X.getB())) + Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
         
             System.out.println("La soluci�n 1 es: "+num1+"\nLa soluci�n 2 es: "+num2);  
     }
         
         
      public void obtenerRaiz(Raices X){
       
            double num1 = (Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()));
         
             System.out.println("La soluci�n es: "+num1);  
     }
    
      
      public void calcular(boolean tieneRaices, boolean tieneRaiz, Raices X){
          
          if (tieneRaices){
              obtenerRaices(X);
          } else if (tieneRaiz){
              obtenerRaiz(X);
          } else {System.out.println("No se obtienen raices");}
          
      }
      
}
