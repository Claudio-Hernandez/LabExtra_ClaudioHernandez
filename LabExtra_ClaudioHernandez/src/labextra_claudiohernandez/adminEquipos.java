/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labextra_claudiohernandez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudio Hernandez
 */
public class adminEquipos {
     private ArrayList<equipos> listaEquipos = new ArrayList();
    private File archivo = null;

    public adminEquipos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<equipos> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<equipos> listaPersonas) {
        this.listaEquipos = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaEquipos;
    }

    //extra mutador
    public void setEquipo(equipos p) {
        this.listaEquipos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (equipos t : listaEquipos) {
                bw.write(t.getSlogan()+ ";");
                bw.write(t.getNombre()+ ";");
                bw.write(t.getPaisDeOrigen()+ ";");
                bw.write(t.getCampeonatosGanados() + ";");
                for (jugadores listaJugadores : t.getJugadores()) {
                bw.write(listaJugadores.getNombre() + ";");
                bw.write(listaJugadores.getApellido() + ";");
                bw.write(listaJugadores.getEdad() + ";");
                bw.write(listaJugadores.getBalonesOro() + ";");
                bw.write(listaJugadores.getMedallas() + ";");
                bw.write(listaJugadores.getEsOlimpico() + ";");
               
                    
                }
                            //    bw.write("\n");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaEquipos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    
                    System.out.println("tiene");
                  String slogan =   sc.next();
                    System.out.println(slogan);
                    String nombre = sc.next();
                    System.out.println(nombre);
                    String paisDeOrigen=sc.next();
                    System.out.println(paisDeOrigen);
                    int campeo = sc.nextInt();
                    System.out.println(campeo);
                    ArrayList<jugadores>jugadorAgregar =  new ArrayList();
                    String nombreju  = sc.next();
                    System.out.println(nombreju);
                    String apellido = sc.next();
                    System.out.println(apellido);
                    int edad = sc.nextInt();
                    System.out.println(edad);
                    int balones =  sc.nextInt();
                    System.out.println(balones);
                    int medallas =  sc.nextInt();
                    System.out.println(medallas);
                    String esO = sc.next();
                    System.out.println(esO);
                    jugadorAgregar.add(new jugadores(nombreju, apellido, edad, balones, medallas, esO));
                    listaEquipos.add(new equipos(sc.next(),sc.next(),sc.next(),sc.nextInt(),jugadorAgregar ));
                   // sc.nextLine();

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
