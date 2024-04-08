/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author victor
 */
public class Metodos {
    //Obtener una lista de personas nacidas en 1985, ordenadas por su email.
    
    public static List<Persona> listaPersonas1985YOrdenadasEmail(List<Persona> lista){
        return lista;
    }
    
    public static List<Persona> listaPersonas1985YOrdenadasEmailStream(List<Persona> lista){
     
        return lista.stream().filter(p-> p.calcularEdad()==1985)
                .sorted((p1,p2)->p1.email().compareToIgnoreCase(p2.email()))
                .collect(Collectors.toList());
    }
}
