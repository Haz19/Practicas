package mx.unam.fi.poo.g1.p2;

import mx.unam.fi.poo.g1.p2.*;
/**
 * Clase principal de la Practica 2
 * @author Haziel Alvarez
 * @version Septiembre
 */
public class Triangulo {

    /**
    * Método para la clase main
    * Donde todo se ejecuta
    * @author Haziel Alvarez
    * @param args 
    */
    public static void main(String[] args) {
        
        Variables variable = new Variables(5, 1);

        int n = variable.getN();
        
        Procedimiento triangulo = new Procedimiento();
        
        String resultado = triangulo.generarProcedimiento(n); 
    
        System.out.println("Triángulo de Pascal con " + n + " filas:");
        System.out.println(resultado);
    }
}
