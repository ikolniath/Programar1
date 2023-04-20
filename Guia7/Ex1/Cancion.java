//Desarrollar una clase Cancion con los siguientes atributos: t�tulo y autor. Se deber� definir adem�s dos constructores: uno vac�o que inicializa el t�tulo y el autor a cadenas vac�as y otro que reciba como par�metros el t�tulo y el autor de la canci�n. Se deber�n adem�s definir los m�todos getters y setters correspondientes.
package Guia7.Ex1;

public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
}
