package mx.unam.fi.poo.g1.p2;

import mx.unam.fi.poo.g1.p2.Variables;

/**
 * Clase Procedimientos
 * Genera un triángulo de Pascal con # cantidad de filas
 * @author Haziel Alvarez
 * @version Septiembre
 */
public class Procedimiento {

    /**
     * Metodo para generar el procedimiento
     * @param n -> Valor para la cantidad de filas
     * @return -> El triángulo en formato String
     */
    public String generarProcedimiento(int n) {
        StringBuilder resultado = new StringBuilder(); 

        for (int i = 0; i < n; i++) {
            int nSup = 1; 
            for (int j = 0; j <= i; j++) {
                resultado.append(nSup).append(" "); 
                nSup = nSup * (i - j) / (j + 1); 
            }
            resultado.append("\n");
        }

        return resultado.toString();
    }
}
    