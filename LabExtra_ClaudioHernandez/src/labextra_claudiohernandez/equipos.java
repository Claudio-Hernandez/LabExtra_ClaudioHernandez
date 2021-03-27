/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labextra_claudiohernandez;

import java.util.ArrayList;

/**
 *
 * @author Claudio Hernandez
 */
public class equipos {
    private String slogan;
    private String nombre;
    private String paisDeOrigen;
    private int campeonatosGanados;
    private ArrayList<jugadores>jugadores = new ArrayList();

    public equipos(String slogan, String nombre, String paisDeOrigen, int campeonatosGanados,ArrayList<jugadores> jugadores) {
        this.slogan = slogan;
        this.nombre = nombre;
        this.paisDeOrigen = paisDeOrigen;
        this.campeonatosGanados = campeonatosGanados;
        this.jugadores= jugadores;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }

    public ArrayList<jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "equipos{" + "slogan=" + slogan + ", nombre=" + nombre + ", paisDeOrigen=" + paisDeOrigen + ", campeonatosGanados=" + campeonatosGanados + ", jugadores=" + jugadores + '}';
    }
    
    
}
