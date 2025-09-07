
package tiposdedatosabstractos;

import java.util.Scanner;


public class MenuCilindro {
     public static void mostrarMenu(Scanner sc) {
    System.out.print("\nIngresa el radio: ");
        double radio = sc.nextDouble();
        System.out.print("Ingresa la altura: ");
        double altura = sc.nextDouble();
        Cilindro cilindro = new Cilindro(radio, altura);

        int opcion;
        do {
            System.out.println("\n--- MENÚ CILINDRO ---");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular volumen");
            System.out.println("3. Mostrar dimensiones");
            System.out.println("4. Cambiar radio");
            System.out.println("5. Cambiar altura");
            System.out.println("0. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Área: " + cilindro.area());
                    break;
                case 2:
                    System.out.println("Volumen: " + cilindro.volumen());
                    break;
                case 3:
                    System.out.println("Radio: " + cilindro.getRadio() + ", Altura: " + cilindro.getAltura());
                    break;
                case 4:
                    System.out.print("Nuevo radio: ");
                    cilindro.setRadio(sc.nextDouble());
                    break;
                case 5:
                    System.out.print("Nueva altura: ");
                    cilindro.setAltura(sc.nextDouble());
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
