package mx.unam.fi.poo.g1.p1;

import mx.unam.fi.poo.g1.p1.Coordenadas;
/**
 * Clase Cálculos
 * @author Haziel Alvarez
 * @version Septiembre
 */
public class Calculos {
    
    /**
     * Método para calcular la distancia
     * @param x1 -> Primera coordenada en X
     * @param y1 -> Primera coordenada en Y
     * @param x2 -> Segunda coordenada en X
     * @param y2 -> Segunda coordenada en Y
     * @return distancia -> Devuelve el valor de la distancia segun las coordenadas ingresadas
     */
    public double DistanciaTierra(double x1, double y1, double x2, double y2){
        return((6371.01 * Math.acos(Math.sin(x1)*Math.sin(x2) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1)))));
    }
}