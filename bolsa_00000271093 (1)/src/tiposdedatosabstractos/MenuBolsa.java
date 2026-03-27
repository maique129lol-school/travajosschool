package tiposdedatosabstractos;

import implementaciones.BolsaImp;
import excepciones.BolsaException;
import java.util.Scanner;

/**
 * Archivo: MenuBolsa.java
 * Alumno: ROYER ALEKZANDER DUARTE GIL
 * ID:00000271093
 * Propósito: Menú interactivo para trabajar con la Bolsa.
 */
public class MenuBolsa {

    public static void mostrarMenu(Scanner sc) {
        System.out.print("Ingrese tamaño de la bolsa: ");
        int tam = sc.nextInt();
        BolsaImp bolsa = new BolsaImp(tam);

        int opcion;
        do {
            System.out.println("\n--- MENU BOLSA ---");
            System.out.println("1. Verificar si está vacía");
            System.out.println("2. Agregar objeto");
            System.out.println("3. Mostrar número de objetos");
            System.out.println("4. Ver si contiene un objeto");
            System.out.println("5. Remover objeto específico");
            System.out.println("6. Remover objeto al azar");
            System.out.println("7. Limpiar bolsa");
            System.out.println("8. Mostrar objetos");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            try {
                switch (opcion) {
                    case 1 -> System.out.println("¿Bolsa vacía? " + bolsa.vacia());
                    case 2 -> {
                        System.out.print("Ingrese número a agregar: ");
                        int obj = sc.nextInt();
                        bolsa.agrega(obj);
                        System.out.println("Objeto agregado.");
                    }
                    case 3 -> System.out.println("Número de objetos: " + bolsa.obtenNumObjetos());
                    case 4 -> {
                        System.out.print("Ingrese número a buscar: ");
                        int obj = sc.nextInt();
                        System.out.println("¿Existe en la bolsa? " + bolsa.contiene(obj));
                    }
                    case 5 -> {
                        System.out.print("Ingrese número a remover: ");
                        int obj = sc.nextInt();
                        Integer eliminado = bolsa.remueve(obj);
                        System.out.println("Resultado: " + (eliminado != null ? eliminado : "No estaba en la bolsa"));
                    }
                    case 6 -> System.out.println("Removido al azar: " + bolsa.remueve());
                    case 7 -> {
                        bolsa.limpia();
                        System.out.println("Bolsa limpiada.");
                    }
                    case 8 -> System.out.println("Objetos en la bolsa: " + bolsa.toString());
                    case 0 -> System.out.println("Volviendo al menú principal...");
                    default -> System.out.println("Opción no válida.");
                }
            } catch (BolsaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }
}

