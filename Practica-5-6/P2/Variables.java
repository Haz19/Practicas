package mx.unam.fi.poo.g1.p2;

/**
 * Clase Variables
 * Almacena los valores de n y nSup
 * @author Haziel Alvarez
 * @version Septiembre
 */
public class Variables {
    private int n;
    private int nSup;

    /**
     * Método constructor
     * Inicializa a n y nSup
     * @param n
     * @param nSup
     */
    public Variables(int n, int nSup) {
        setN(n);
        setNSup(nSup);
    }

    /**
     * Método get
     * @return n -> Regresa la variable n
     */
    public int getN() {
        return n;
    }

     /**
     * Metodo set
     * @param n -> Para cambiar el valor de n
     * 
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * Metodo set
     * @param nSup -> Para cambiar el valor de nSup
     * 
     */
    public void setNSup(int nSup) {
        this.nSup = nSup;
    }

}