/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deber� contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas m�ximas que puede realizar el usuario.
 */
package guia9.Ex2.Ahorcado;

public class Ahorcado {
    
    private char [] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
    
}
