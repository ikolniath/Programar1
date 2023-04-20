/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
M�todo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad m�xima. 
M�todo servirTaza(int): se pide el tama�o de una taza vac�a, el m�todo recibe el tama�o de la taza y simula la acci�n de servir la taza con la capacidad indicada. Si la cantidad actual de caf� ?no alcanza? para llenar la taza, se sirve lo que quede. El m�todo le informar� al usuario si se llen� o no la taza, y de no haberse llenado en cuanto qued� la taza.
M�todo vaciarCafetera(): pone la cantidad de caf� actual en cero. 
M�todo agregarCafe(int): se le pide al usuario una cantidad de caf�, el m�todo lo recibe y se a�ade a la cafetera la cantidad de caf� indicada.
 */
package Guia8.E2.CafeteraServicio;
import Guia8.E2.Cafetera.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public String llenarCafetera(Cafetera Caf){
        
        if (Caf.getCapacidadActual() < Caf.getCapacidadMaxima()){
            Caf.setCapacidadActual(Caf.getCapacidadMaxima());
            return "La cafetera quedo llena al m�ximo";
        } else { return "la cafetera est� al M�ximo";}        
    }
    
    public void servirTaza(Cafetera Caf){
        
        int taza =0;
        do{
        System.out.println("Indique el Tama�o de su taza a llenar\n* 125 ml \n* 150 ml \n* 200 ml\nIngrese solamente el n�mero de las opciones, no acepta otra opci�n!");
        taza = input.nextInt();   
        
        }while(taza != 150 && taza != 125 && taza != 200);
        
        if (Caf.getCapacidadActual() >= taza ){
            Caf.setCapacidadActual(Caf.getCapacidadActual()-taza);
            System.out.println("La taza quedo llena");
        } else if (Caf.getCapacidadActual() < taza){
            taza = Caf.getCapacidadActual();
            Caf.setCapacidadActual(0);
            System.out.println("La taza solo se pudo llenar con "+taza+"ml.");
        }                
    }
    
    public String vaciarCafetera(Cafetera Caf){
        
        Caf.setCapacidadActual(0);
        return "La cafetera ha quedado vacia";
        
    }
    
    public void agregarCafe(Cafetera Caf){
        
        int llenar = 0;
        System.out.println("La cafetera tiene " +Caf.getCapacidadActual()+"ml. El m�ximo de la cafetera es "+Caf.getCapacidadMaxima()+"ml.");
        do {            
            System.out.println("Ingrese la cantidad de Cafe a ingresar, recuerde no superar la capacidad m�xima");
            llenar = input.nextInt();
        } while ((llenar+Caf.getCapacidadActual()) > Caf.getCapacidadMaxima());
        
        Caf.setCapacidadActual(llenar+Caf.getCapacidadActual());
        System.out.println("La capacidad de la cafetera actual es "+Caf.getCapacidadActual()+"ml.");
    }
}
