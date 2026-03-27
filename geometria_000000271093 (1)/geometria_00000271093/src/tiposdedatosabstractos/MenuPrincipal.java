package tiposdedatosabstractos;

import java.util.Scanner;

/**
 * Archivo: MenuPrincipal.java
 * Alumno: ROYER ALEKZANDER DUARTE GIL
 * ID:00000271093
 * Propósito: Menú principal para gestionar Bolsa y Cilindro.
 */
public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("2. Trabajar con Cilindro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 2 -> MenuCilindro.mostrarMenu(sc);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
