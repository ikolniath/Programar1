/*
 Crear la clase ArregloService, en el paquete servicio, con los siguientes m�todos:
M�todo inicializarA recibe un arreglo por par�metro y lo inicializa con n�meros aleatorios.
M�todo mostrar recibe un arreglo por par�metro y lo muestra por pantalla.
M�todo ordenar recibe un arreglo por par�metro y lo ordena de mayor a menor.
M�todo inicializarB copia los primeros 10 n�meros del arreglo A en el arreglo B. Luego llenar las �ltimas 10 posiciones del arreglo B con 0.5.
 */
package guia9.E3.ArregloServicio;

import java.util.Arrays;

public class ArregloServicio {

    public void incializarA(double[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (100));
        }
    }

    public void mostra(double[] a) {

        for (double d : a) {
            System.out.print(d + " ");
        }
        System.out.println("");
    }

    public void ordenar(double[] a) {
        int num = 0;
        double[] c = a.clone();
        Arrays.sort(c);
        
        for (int i = c.length - 1; i >= 0; i--) {
            a[num] = c[i];
            num++;
            //System.out.print(c[i] + " "); 
        }

        //System.out.println("");
    }

    public void IncializarB(double[] a, double[] b) {
        double num = 0.5;
        System.arraycopy(a, 0, b, 0, b.length);
        Arrays.fill(b, 10, b.length, num);
        
    }
}
