/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author victor
 */
public class Metodos {
    //Obtener una lista de personas nacidas en 1985, ordenadas por su email.
    
    public static List<Persona> listaPersonas1985YOrdenadasEmail(List<Persona> lista){
        List<Persona> listado = new ArrayList<>();
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).fecha_nacimiento().getYear()==1985){
                listado.add(lista.get(i));
            }
        }
        Collections.sort(listado, (p1,p2)->p1.email().compareToIgnoreCase(p2.email()));
        return listado;
    }
    
    public static List<Persona> listaPersonas1985YOrdenadasEmailStream(List<Persona> lista){
     
        return lista.stream().filter(p-> p.fecha_nacimiento().getYear()==1985)
                .sorted((p1,p2)->p1.email().compareToIgnoreCase(p2.email()))
                .collect(Collectors.toList());
    }
    
//      Obtener un set de correos electrónicos, ordenados alfabéticamente,
//      de aquellas personas cuyo género es "non-binary" y estén jubiladas.
    public static Set<String> setCorreosPersonasNonbinaryYJubildadas(List<Persona> lista){
        Set<String> listado = new TreeSet<>();
        for (Persona p : lista) {
            if(p.genero().equalsIgnoreCase("Non-binary")&&p.jubilado()==true){
                listado.add(p.email());
            }
        }
        return listado;
    }
    
    public static Set<String> setCorreosPersonasNonbinaryYJubildadasStream(List<Persona> lista){
 
        return lista.stream().filter(p->p.jubilado()==true&&p.genero().equalsIgnoreCase("non-binary"))
                .map(Persona::email)
                .collect(Collectors.toCollection(TreeSet::new));
    }
    
//METODO Obtener el número de ciudades diferentes
    public static int numeroCiudades(List<Persona> lista){
        Set<String> ciudades = new HashSet<>();
        for (Persona c : lista) {
            ciudades.add(c.ciudad());
        }
        return ciudades.size();
    }
    
    public static int numeroCiudadesStream(List<Persona> lista){
        return (int)lista.stream().map(Persona::ciudad).distinct().count();
    }

//Método para Comprobar si alguna persona se llama "Zondra".
    public static boolean alguienZondra(List<Persona> lista){
        boolean esta=false;
        for (Persona persona : lista) {
            if(persona.nombre().equalsIgnoreCase("zondra")){
                return true;
            }
        }
        return esta;
    }
    
    public static boolean alguienZondraStream(List<Persona> lista){
        return lista.stream().anyMatch(p->p.nombre().equalsIgnoreCase("zondra"));
    }
    
            
//      Método Comprobar si ninguna persona vive en "Estepona".
    public static boolean nadieDeEstepona(List<Persona> lista){
        boolean nadie=true;
        for (Persona persona : lista) {
            if(persona.ciudad().equalsIgnoreCase("estepona")){
                nadie=false;
            }
        }
        return nadie;
    }
    
    public static boolean nadieDeEsteponaStream(List<Persona> lista){
        return lista.stream().noneMatch(p-> p.ciudad().equalsIgnoreCase("estepona"));
    }
    
//    METODO Saber cuantas personas tienen en su apellido la terminación "cía".
    public static int saberCuantasPersonasTerminanEnCia(List<Persona> lista){
        int sumatoria=0;
        for (int i=0; i<lista.size();i++) {
            
            if(lista.get(i).apellido().endsWith("cia")){
                sumatoria++;
            }
        }
        return sumatoria;
    }
    
    public static int saberCuantasPersonasTerminanEnCiaStream(List<Persona> lista){
        return (int)lista.stream().filter(p->p.apellido().endsWith("cia")).count();
    }
    
 //   Método Obtener una lista con todas las edades de cada persona.
    public static List<Integer> generarListaEdades(List<Persona> lista){
        List<Integer> listado = new ArrayList<>();
        
        for (Persona persona : lista) {
            listado.add(persona.calcularEdad());
        }
        return listado;
    }
    
    public static List<Integer> generarListaEdadesStream(List<Persona> lista){
        return lista.stream().map(Persona::calcularEdad).collect(Collectors.toList());
    }
//    Método para Obtener la suma de todas las edades de las personas de la lista.
    public static long sumaTodasEdades(List<Persona> lista){
        long sumatoria=0;
        for (Persona persona : lista) {
            sumatoria+=persona.calcularEdad();
        }
        return sumatoria;
    }
    
    public static long sumaTodasEdadesStream(List<Persona> lista){
        return lista.stream().mapToLong(Persona::calcularEdad).sum();
    }
    
//    Método para Obtener la media de edad de las personas de la lista.
    public static double mediaEdades(List<Persona> lista){
        double media=0;
        for (Persona persona : lista) {
            media+=persona.calcularEdad();
        }
        return media/lista.size();
    }
    
    public static OptionalDouble mediaEdadesStream(List<Persona> lista){
        return lista.stream().mapToDouble(Persona::calcularEdad).average();
    }
    
//    Método para Obtener en un String todos los nombres de las personas concatenados.
    public static String todosLosNombres(List<Persona> lista){
        StringBuilder concadenado= new StringBuilder();
        for (Persona persona : lista) {
            concadenado.append(persona.nombre()).append(" ");
        }
        return concadenado.toString();
    }
    
    public static String todosLosNombresStream(List<Persona> lista){
        return lista.stream().map(Persona::nombre).collect(Collectors.joining(" "));
    }
}
