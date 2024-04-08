/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor
 */
public class Lectura {
    //METODOS LECTURA
    //Leer el fichero para extraer los datos
    public static List<String> extraerDatos() {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get("personas.csv"),
                    StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        lineas.remove(0);
        return lineas;
    }
    
      //Método para almacenar las Personas en la listaPersonas
    public static List<Persona> generarListaPersona() {
        //En esta lista almacenamos los datos del fichero
        List<String> lista = extraerDatos();
        //En esta lista almacenamos las personas
        List<Persona> listaPersona = new ArrayList<>();
        //Bucle para recorrer los datos y convertislos en Personas
        // y almacenarlso en la lista de personas
        for (int i = 0; i < lista.size() - 1; i++) {
            String datos[] = lista.get(i).split(",");
            //Formateamos la fecha de String a fecha
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fecha = LocalDate.parse(datos[5], formatter);
            //Creamos una variable temporal de Persona para almacenarla
            Persona temporal = new Persona(datos[0], datos[1], datos[2], datos[3], datos[4], fecha, Boolean.parseBoolean(datos[6]), datos[7]);
            listaPersona.add(temporal);
        }
        return listaPersona;
    }
}
