/*
Un profesor particular est� dando cursos para grupos de cinco alumnos y necesita un programa para organizar la informaci�n de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos atributos ser�n: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (ma�ana o tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensi�n 5 (cinco), donde se alojar�n los nombres de cada alumno
 */
package guia9.E6.CursoG9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CursoG9 {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String [] alumnos;

    public CursoG9() {
    }

    public CursoG9(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }


    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    
    @Override
    public String toString() {
        
        
        return "CursoG9{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }
    
    
    
}
