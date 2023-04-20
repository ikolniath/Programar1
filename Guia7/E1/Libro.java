//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, T�tulo, autor, N�mero de p�ginas, y un constructor con todos los atributos pasados por par�metro y un constructor vac�o. Crear un m�todo para cargar un Libro pidiendo los datos al usuario y luego informar mediante otro m�todo el n�mero de ISBN, el t�tulo, el autor del Libro y el n�mero de p�ginas.
package Guia7.E1;

import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numero_pagina;
    
    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int Numero_pagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_pagina = Numero_pagina;
    }
    

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumero_pagina() {
        return numero_pagina;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public void setNumero_pagina(int Numero_pagina) {
        this.numero_pagina = Numero_pagina;
    }
    
    Scanner input = new Scanner(System.in);
    
    public void cargar() {

        
        System.out.println("Ingrese el ISBN");
        this.ISBN = input.nextInt();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Titulo");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el Autor");
        this.autor = leer.nextLine();
        System.out.println("Ingrese N�mero de P�gina");
        this.numero_pagina = input.nextInt();

    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN= " + ISBN + ", titulo= " + titulo + ", autor= " + autor + ", numero_pagina= " + numero_pagina + '}';
    }
    
   
}

