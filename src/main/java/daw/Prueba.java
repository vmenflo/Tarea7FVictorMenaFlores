/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.List;

/**
 *
 * @author victor
 */
public class Prueba {
    public static void main(String[] args) {
//        Procede a leer el fichero persona.csv y carga los datos en 
//        una lista de objetos Persona. Crea un método en Persona que devuelva la 
//        edad de esa persona.
        List<Persona> listaPersonas = Lectura.generarListaPersona();
        listaPersonas.forEach(System.out::println);
        
    }
}
