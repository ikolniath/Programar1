/*
M�todos getters y setters para el n�mero de DNI y la letra.
M�todo crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponder�. Una vez calculado, le asigna la letra que le corresponde seg�n
M�todo mostrar(): que nos permita mostrar el NIF (ocho d�gitos, un guion y la letra en may�scula; por ejemplo: 00395469-F).
La letra correspondiente al d�gito verificador se calcular� a traves de un m�todo que funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el n�mero de DNI por 23 (el resultado debe ser un n�mero entre 0 y 22). El m�todo debe buscar en un array (vector) de caracteres la posici�n que corresponda al resto de la divisi�n para obtener la letra correspondiente. La tabla de caracteres es la siguiente:

 */
package Guia8.Ex2.ServicioNIF;

import Guia8.Ex2.NIF.NIF;
import java.util.Scanner;

public class ServicioNIF {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private NIF crearNif(){
        
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D','X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        System.out.println("Ingrese su DNI");
        long dni = input.nextLong();
        
        int resultado = (int) dni%23;
        
        char letra = letras[resultado];
        
        return new NIF(dni,letra);
    }
    
    public void mostrar(){
        System.out.println(crearNif().toString());    
    }
    
    
    
}
