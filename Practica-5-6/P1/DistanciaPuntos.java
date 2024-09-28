package mx.unam.fi.poo.g1.p1;

import mx.unam.fi.poo.g1.p1.*;

/**
 * Clase Principal de la Practica 1
 * @author Haziel Alvarez
 * @version Septiembre
 */
public class DistanciaPuntos {
    /**
     * Método Main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {

        Coordenadas coordenadas = new Coordenadas(21.34, 19.7, 20.5, 198.43);
        
        Calculos calculos = new Calculos();
        
        double distancia = calculos.DistanciaTierra(coordenadas.getX1(), coordenadas.getY1(), coordenadas.getX2(), coordenadas.getY2());
        
        System.out.println("La distancia es de: " + distancia + " [km]");
    }
}