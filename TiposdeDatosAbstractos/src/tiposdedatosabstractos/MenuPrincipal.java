
package tiposdedatosabstractos;

import java.util.Scanner;

public class MenuPrincipal {

    
    public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
int opcion;
do {
    System.out.println("menu principal");
    System.out.println("1 trabajar con bolsa");
    System.out.println("2 trajar con cilindro");
    System.out.println("0 salir ");
    System.out.println("seleccione una opcion: ");
opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1:
              MenuBolsa.mostrarMenu(sc);   
                break;
        case 2:
       MenuCilindro.mostrarMenu(sc);
                break;
        case 0:
             System.out.println("salistes....");   
                break;
        default: 
            System.out.println("no existe esta opcion porfavor selecciona una opcion correcta");
        }
        }while (opcion != 0);
sc.close();

// TODO code application logic here
    }
  }

