package mx.unam.fi.poo.g1.p1;

/**
 * Clase Coordenadas
 * @author Haziel Alvarez
 * @version Septiembre
 */
public class Coordenadas{
    private Double x1, x2, y1, y2;


    public Coordenadas(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    
    /**
     * Metodo get
     * @return -> Regresa el atributo x1
     */
    public double getX1(){
        return x1;
    }

    /**
     * Metodo get
     * @return -> Regresa el atributo x2
     */
    public double getX2(){
        return x2;
    }

    /**
     * Metodo get
     * @return -> Regresa el atributo y1
     */
    public double getY1(){
        return y1;
    }

    /**
     * Metodo get
     * @return -> Regresa el atributo y2
     */
    public double getY2(){
        return y2;
    }

}
