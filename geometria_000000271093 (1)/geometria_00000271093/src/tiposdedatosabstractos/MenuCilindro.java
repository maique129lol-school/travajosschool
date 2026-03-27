package tiposdedatosabstractos;

import implementaciones.CilindroImp;
import java.util.Scanner;

/**
 * Archivo: MenuCilindro.java
 * Alumno: ROYER ALEKZANDER DUARTE GIL
 * ID:00000271093
 * Propósito: Menú interactivo para trabajar con Cilindros.
 */
public class MenuCilindro {

    public static void mostrarMenu(Scanner sc) {
        System.out.print("Ingrese radio del cilindro: ");
        double radio = sc.nextDouble();
        System.out.print("Ingrese altura del cilindro: ");
        double altura = sc.nextDouble();

        try {
            CilindroImp cilindro = new CilindroImp(radio, altura);
            System.out.println("Cilindro creado: " + cilindro.toString());
            System.out.println("Área: " + cilindro.area());
            System.out.println("Volumen: " + cilindro.volumen());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
