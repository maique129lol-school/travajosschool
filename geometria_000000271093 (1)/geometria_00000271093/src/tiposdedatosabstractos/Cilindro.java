package tiposdedatosabstractos;

/**
 * Archivo: Cilindro.java
 * Alumno: ROYER ALEKZANDER DUARTE GIL
 * ID:00000271093
 * Propósito: Clase abstracta que define el TDA de un Cilindro.
 */
public abstract class Cilindro {
    protected double radio;
    protected double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public abstract double area();
    public abstract double volumen();
    public abstract String toString();
}
