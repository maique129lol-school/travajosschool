
package tiposdedatosabstractos;

import java.util.Scanner;


public class MenuBolsa {
public static void mostrarMenu(Scanner sc){
    System.out.println("inglesa el tamaño maximo de tu bolsa");
    int tam = sc.nextInt();
    Bolsa<String> bolsa = new Bolsa <> (tam);
    int opcion;
    do {
        System.out.println("\n MENU BOLSA");
        System.out.println("1 agrega un objeto");
        System.out.println("2 remover objeto al azar");
        System.out.println("3 remover objeto especifico");
        System.out.println("4 mostrar numero de objetos");
        System.out.println("5 ver si esta vacia ");
        System.out.println("6 contar ocurrencias");
        System.out.println("7 buscar objetos");
        System.out.println("8 mostrar objetos");
        System.out.println("9 limpiar bolsa");
        System.out.println("0 volver al menu principal");
        System.out.println("selecciona una opcion");
        opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
                case 1:
                    System.out.print("Objeto a agregar: ");
                    String obj = sc.nextLine();
                    bolsa.agrega(obj);
                    break;
                case 2:
                    String eliminado = bolsa.remueve();
                    if (eliminado != null) {
                        System.out.println("Removido: " + eliminado);
                    }
                    break;
                case 3:
                    System.out.print("Objeto a remover: ");
                    String objRemover = sc.nextLine();
                    bolsa.remueve(objRemover);
                    break;
                case 4:
                    System.out.println("Número de objetos: " + bolsa.obtenNumObjetos());
                    break;
                case 5:
                    System.out.println("¿Está vacía? " + bolsa.vacia());
                    break;
                case 6:
                    System.out.print("Objeto a contar: ");
                    String objContar = sc.nextLine();
                    System.out.println("Ocurre " + bolsa.cuenta(objContar) + " veces.");
                    break;
                case 7:
                    System.out.print("Objeto a buscar: ");
                    String objBuscar = sc.nextLine();
                    System.out.println("¿Contiene \"" + objBuscar + "\"? " + bolsa.contiene(objBuscar));
                    break;
                case 8:
                    System.out.println("Objetos: " + bolsa.obtenObjetos());
                    break;
                case 9:
                    bolsa.limpia();
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

