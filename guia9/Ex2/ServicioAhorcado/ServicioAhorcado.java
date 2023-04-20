/*
Definir los siguientes m�todos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas m�xima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Despu�s ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un �ndice del vector. Y tambi�n, guarda la cantidad de jugadas m�ximas y el valor que ingres� el usuario.
M�todo longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
M�todo buscar(letra):  este m�todo recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. Tambi�n informar� si la letra estaba o no.
M�todo encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cu�ntas le faltan. Este m�todo adem�s deber� devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no est�, se le restar� uno a sus oportunidades.
M�todo intentos(): para mostrar cu�ntas oportunidades le queda al jugador.
M�todo juego(): el m�todo juego se encargar� de llamar todos los m�todos previamente mencionados e informar� cuando el usuario descubra toda la palabra o se quede sin intentos. Este m�todo se llamar� en el main.
 */
package guia9.Ex2.ServicioAhorcado;


import guia9.Ex2.Ahorcado.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;


public class ServicioAhorcado {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Ahorcado A = new Ahorcado();
    
    public void crearJuego(){
        
        System.out.println("Comienzo del juego\nIngrese la palabra a adivinar");
        String palabra = input.next().toLowerCase();
        System.out.println("Ingrese la cantidad de veces que puede intentar el jugador");
        A.setJugadasMaximas(input.nextInt());
        
        A.setPalabra(palabra.toCharArray());
        
    }
    
    public void mostrar(){
        
        System.out.println("La longitud de la palabra es: "+A.getPalabra().length);
    }
    
    public void buscar(char x){
        
        int flag = 0;
        
        for (int i = 0; i < A.getPalabra().length; i++) {
            
            if (A.getPalabra() [i] == x){
                flag++;
            }
        }
        
        
        if(flag != 0){System.out.println("La letra se encuentra en la palabra");}
        else {System.out.println("La letra no se encuentra en la palabra");}
        
    }
    
    public boolean encontrada(char x) {
            
        int flag = 0;
        int letras = A.getLetrasEncontradas();

        for (int i = 0; i < A.getPalabra().length; i++) {

            if (A.getPalabra()[i] == x) {
                flag++;
            }
        }

        A.setLetrasEncontradas(letras+flag);
        
        System.out.println("Usted ya encontro "+ A.getLetrasEncontradas() + " letras\nLe restan encontrar "+ (A.getPalabra().length-A.getLetrasEncontradas()) + " letras");
        return flag != 0;

    }

    
    public void intentos(){
        
        System.out.println("A usted le quedan "+ A.getJugadasMaximas() + " Intentos");
        
    }
    
    
    public void juego() {
        
        int fin = 0;
        
        crearJuego();
        mostrar();

        do {

            System.out.println("Ingrese una letra a buscar");
            String letra = input.next().toLowerCase();
            char l = letra.charAt(0);

            buscar(l);
            if (!encontrada(l)) {
                A.setJugadasMaximas(A.getJugadasMaximas() - 1);
            }
            intentos();
            
            if (A.getJugadasMaximas()<1){
                System.out.println("Usted se ha quedado sin intentos\nPERDIO!!!");
                fin++;
            }else if (A.getLetrasEncontradas() == A.getPalabra().length){
                System.out.println("Usted Ha encontrado todas las letras de la palabra " + Arrays.toString(A.getPalabra()) + "\n��USTED HA GANADO!!" );
                fin++;
            }

        } while (1 != fin);

    }
}
