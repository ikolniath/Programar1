/*
M�todo fechaNacimiento que pregunte al usuario d�a, mes y a�o de su nacimiento. Luego los pase por par�metro a un nuevo objeto Date. El m�todo debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
M�todo fechaActual que cree un objeto fecha con el d�a actual. Para esto usaremos el constructor vac�o de la clase Date. Ejemplo: Date fechaActual = new  Date();
El m�todo debe retornar el objeto Date.
M�todo diferencia que reciba las dos fechas por par�metro y retorna la diferencia de a�os entre una y otra (edad del usuario).
 */
package guia9.E4.FechaService;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FechaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Date FechaNacimiento(){
        
        System.out.println("Ingrese el d�a de nacimiento");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes (en n�mero) de nacimiento");
        int mes = input.nextInt();
        System.out.println("Ingrese el a�o de nacimiento");
        int anio = input.nextInt();
        
        return new Date(anio-1900,mes-1,dia);
        
    }
    
    public Date fechaActual(){
        
        return new Date();
        
    }
    
    public void diferencia(Date x){
        
        Calendar fecha = new GregorianCalendar();
        Date fecha1 = new Date();
        
        System.out.println(fecha.getWeekYear());
        int anio = fecha.get(Calendar.YEAR);
        
        System.out.println("La diferencia de a�os entre la dos fechas es de: "+ (anio-x.getYear()) );
        
    }
    
}
