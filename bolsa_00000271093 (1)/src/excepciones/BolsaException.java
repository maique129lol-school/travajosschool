package excepciones;

/**
 * Archivo: BolsaException.java
 * Alumno: ROYER ALEKZANDER DUARTE GIL
 * ID:00000271093
 * Propósito: Clase excepción para operaciones inválidas en Bolsa.
 */
public class BolsaException extends RuntimeException {
    public BolsaException() {
        super();
    }

    public BolsaException(String s) {
        super(s);
    }
}
