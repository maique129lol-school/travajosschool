package implementaciones;

import tiposdedatosabstractos.Cilindro;

/**
 * Archivo: CilindroImp.java
 * Alumno: ROYER ALEKZANDER DUARTE GIL
 * ID:00000271093
 * Propósito: Implementación del TDA Cilindro.
 */
public class CilindroImp extends Cilindro {

    public CilindroImp(double radio, double altura) {
        super(radio, altura);
        if (radio < 0 || altura < 0) {
            throw new IllegalArgumentException("El radio y la altura deben ser positivos.");
        }
    }

    @Override
    public double area() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    @Override
    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return "Cilindro(" + radio + ", " + altura + ")";
    }
}
