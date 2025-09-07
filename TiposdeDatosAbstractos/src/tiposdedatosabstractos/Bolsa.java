
package tiposdedatosabstractos;


import java.util.ArrayList;
import java.util.Random;

public class Bolsa<T> {
   int tamBolsa;
   ArrayList<T> objetos;

    
    public Bolsa(int tamBolsa) {
        this.tamBolsa = tamBolsa;
        this.objetos = new ArrayList<>();
    }

    public int obtenNumObjetos() {
        return objetos.size();
    }

    public boolean vacia() {
        return objetos.isEmpty();
    }

    public void agrega(T objeto) {
        try {
            if (objetos.size() >= tamBolsa) {
                throw new Exception("La bolsa está llena, no se puede agregar más.");
            }
            objetos.add(objeto);
            System.out.println("Objeto agregado correctamente.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public T remueve() {
        try {
            if (objetos.isEmpty()) {
                throw new Exception("No se puede remover, la bolsa está vacía.");
            }
            Random random = new Random();
            int index = random.nextInt(objetos.size());
            return objetos.remove(index);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public T remueve(T objeto) {
        try {
            if (!objetos.contains(objeto)) {
                throw new Exception("El objeto no existe en la bolsa.");
            }
            objetos.remove(objeto);
            return objeto;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public void limpia() {
        objetos.clear();
        System.out.println("La bolsa ha sido vaciada.");
    }

    public int cuenta(T objeto) {
        int contador = 0;
        for (T o : objetos) {
            if (o.equals(objeto)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean contiene(T objeto) {
        return objetos.contains(objeto);
    }

    public ArrayList<T> obtenObjetos() {
        return new ArrayList<>(objetos);
    }
}

