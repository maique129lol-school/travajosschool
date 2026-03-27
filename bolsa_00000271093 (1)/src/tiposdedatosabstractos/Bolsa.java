package tiposdedatosabstractos;

/**
 * Archivo: Bolsa.java
 * Alumno: ROYER ALEKZANDER DUARTE GIL
 * ID:00000271093
 * Propósito: Clase abstracta que define el TDA de una Bolsa de enteros.
 */
public abstract class Bolsa {
    protected int tamBolsa;
    protected int numObjetos;

    public Bolsa(int tamBolsa) {
        this.tamBolsa = tamBolsa;
        this.numObjetos = 0;
    }

    public abstract int obtenNumObjetos();
    public abstract boolean vacia();
    public abstract void agrega(Integer objeto);
    public abstract Integer remueve();
    public abstract Integer remueve(Integer objeto);
    public abstract void limpia();
    public abstract int cuenta(Integer objeto);
    public abstract boolean contiene(Integer objeto);
    public abstract Integer[] obtenObjetos();
    public abstract String toString();
}

