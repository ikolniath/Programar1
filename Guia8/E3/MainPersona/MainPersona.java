/*
Crear 4 objetos de tipo Persona con distintos valores, a continuaci�n, llamaremos todos los m�todos para cada objeto, deber� comprobar si la persona est� en su peso ideal, tiene sobrepeso o est� por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por �ltimo, guardaremos los resultados de los m�todos calcularIMC y esMayorDeEdad en distintas variables(arrays), para despu�s calcular un porcentaje de esas 4 personas cuantas est�n por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y tambi�n calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos m�todos adicionales.

*/
package Guia8.E3.MainPersona;

import Guia8.E3.Persona.Persona;
import Guia8.E3.PersonaServicio.PersonaServicio;
import java.util.Scanner;

public class MainPersona {
    
    public static void main(String[] args) {
        
        PersonaServicio Ps = new PersonaServicio();
//       Persona P1 = Ps.creaPersona();
//        Persona P2 = Ps.creaPersona();
//        Persona P3 = Ps.creaPersona();
//        Persona P4 = Ps.creaPersona();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int per1 = input.nextInt();
        
        int [] peso = new int[per1];
        boolean [] mayor = new boolean[per1];
        
        for (int i = 0; i < per1; i++) {

            String Per = String.valueOf(i);
            Persona per = Ps.creaPersona();
            System.out.println(per.getNombre());
            Ps.mensaje(Ps.calcularIMC(per), Ps.esMayorDeEdad(per));
            System.out.println("");
            
            System.out.println(Ps.esMayorDeEdad(per));
            peso [i] = Ps.calcularIMC(per);
            mayor[i] = Ps.esMayorDeEdad(per);
            
            
        }
        
    
        
        Ps.mayor(mayor);
        Ps.peso(peso);
        
   
        
        
        System.out.println("");
        
//        if (Ps.esMayorDeEdad( P1) == true){
//            System.out.println(P1.getNombre()+ " Es Mayor de edad");
//        } else { System.out.println(P1.getNombre()+" Es menor de edad");}
        
//        System.out.println("");
//        System.out.println(Ps.calcularIMC(P1));
        
        
        
    }

}
