/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.List;
import java.util.Set;

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
        
//      Obtener una lista de personas nacidas en 1985, ordenadas por su email.
        System.out.println("Apartado 2");
        //List<Persona> listaFiltrada = Metodos.listaPersonas1985YOrdenadasEmail(listaPersonas);
        List<Persona> listaFiltrada = Metodos.listaPersonas1985YOrdenadasEmailStream(listaPersonas);
        listaFiltrada.forEach(System.out::println);
        
//      Obtener un set de correos electrónicos, ordenados alfabéticamente,
//      de aquellas personas cuyo género es "non-binary" y estén jubiladas.
        System.out.println("Apartado 3");
        //Set<String> correos = Metodos.setCorreosPersonasNonbinaryYJubildadas(listaPersonas);
        Set<String> correos = Metodos.setCorreosPersonasNonbinaryYJubildadasStream(listaPersonas);
        correos.forEach(System.out::println);
        
        //Obtener el número de ciudades diferentes.
        System.out.println("Apartado 4");
        System.out.println(Metodos.numeroCiudades(listaPersonas));
        System.out.println(Metodos.numeroCiudadesStream(listaPersonas));
        
//      Comprobar si alguna persona se llama "Zondra".
        System.out.println("Apartado 5");
        System.out.println("¿Está Zondra? " + Metodos.alguienZondra(listaPersonas));
        System.out.println("¿Está Zondra? " + Metodos.alguienZondraStream(listaPersonas));
        
//        Comprobar si ninguna persona vive en "Estepona".
        System.out.println("Apartado 6");
        System.out.println("No hay nadie de Estepona? " + Metodos.nadieDeEstepona(listaPersonas));
        System.out.println("No hay nadie de Estepona? " + Metodos.nadieDeEsteponaStream(listaPersonas));
        
//        Saber cuantas personas tienen en su apellido la terminación "cía".
        System.out.println("Apartado 7");
        System.out.println(Metodos.saberCuantasPersonasTerminanEnCia(listaPersonas));
        System.out.println(Metodos.saberCuantasPersonasTerminanEnCiaStream(listaPersonas));
        
//        Obtener una lista con todas las edades de cada persona.
        System.out.println("Apartado 8");
        //List<Integer> listaEdad = Metodos.generarListaEdades(listaPersonas);
        List<Integer> listaEdad = Metodos.generarListaEdadesStream(listaPersonas);
        listaEdad.forEach(System.out::println);
        
//        Obtener la suma de todas las edades de las personas de la lista.
        System.out.println("Apartado 9");
        System.out.println(Metodos.sumaTodasEdades(listaPersonas));
        System.out.println(Metodos.sumaTodasEdadesStream(listaPersonas));
        
//        Obtener la media de edad de las personas de la lista.
        System.out.println("Apartado 10");
        System.out.println(Metodos.mediaEdades(listaPersonas));
        System.out.println(Metodos.mediaEdadesStream(listaPersonas));
        
//        Obtener en un String todos los nombres de las personas concatenados.
        System.out.println("Apartado 11");
        System.out.println(Metodos.todosLosNombres(listaPersonas));
        System.out.println(Metodos.todosLosNombresStream(listaPersonas));
        


    }
}
