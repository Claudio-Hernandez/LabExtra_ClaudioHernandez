/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labextra_claudiohernandez;

/**
 *
 * @author Claudio Hernandez
 */
public class jugadores {
    private String nombre;
    private String apellido;
    private int edad;
    private int balonesOro;
    private int medallas;
    private String esOlimpico;

    public jugadores(String nombre, String apellido, int edad, int balonesOro, int medallas, String esOlimpico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.balonesOro = balonesOro;
        this.medallas = medallas;
        this.esOlimpico = esOlimpico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getBalonesOro() {
        return balonesOro;
    }

    public void setBalonesOro(int balonesOro) {
        this.balonesOro = balonesOro;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public String getEsOlimpico() {
        return esOlimpico;
    }

    public void setEsOlimpico(String esOlimpico) {
        this.esOlimpico = esOlimpico;
    }

    @Override
    public String toString() {
        return  nombre + ";" + apellido + ";" + edad + ";" + balonesOro + ";" + medallas + ";" + esOlimpico;
    }
    
}
