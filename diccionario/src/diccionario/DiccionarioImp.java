
package diccionario;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiccionarioImp<K, V>  {

    private static class Entrada<K, V> {
        K llave;
        V valor;

        public Entrada(K llave, V valor) {
            this.llave = llave;
            this.valor = valor;
        }
    }

    private int nEntradas;
    private LinkedList<Entrada<K, V>>[] tabla;
    private static final int SIZE_INITIAL = 16;

    @SuppressWarnings("unchecked")
    public DiccionarioImp() {
        tabla = (LinkedList<Entrada<K, V>>[]) new LinkedList[SIZE_INITIAL];
        nEntradas = 0;
    }

    private int hash(K llave) {
        return Math.abs(llave.hashCode() % tabla.length);
    }

    public V put(K llave, V valor) {
        int indice = hash(llave);

        if (tabla[indice] == null) {
            tabla[indice] = new LinkedList<>();
        }

        for (Entrada<K, V> e : tabla[indice]) {
            if (e.llave.equals(llave)) {
                V valorAnterior = e.valor;
                e.valor = valor;
                return valorAnterior;
            }
        }

        tabla[indice].add(new Entrada<>(llave, valor));
        nEntradas++;
        return null;
    }

    public V get(K llave) {
        int indice = hash(llave);

        if (tabla[indice] == null) return null;

        for (Entrada<K, V> e : tabla[indice]) {
            if (e.llave.equals(llave)) {
                return e.valor;
            }
        }
        return null;
    }

    public boolean contains(K llave) {
        return get(llave) != null;
    }

    public V remove(K llave) {
        int indice = hash(llave);

        if (tabla[indice] == null) return null;

        for (Entrada<K, V> e : tabla[indice]) {
            if (e.llave.equals(llave)) {
                V valor = e.valor;
                tabla[indice].remove(e);
                nEntradas--;
                return valor;
            }
        }
        return null;
    }

    public int size() {
        return nEntradas;
    }

    public boolean empty() {
        return nEntradas == 0;
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        tabla = (LinkedList<Entrada<K, V>>[]) new LinkedList[SIZE_INITIAL];
        nEntradas = 0;
    }

    public List<K> keys() {
        List<K> llaves = new ArrayList<>();

        for (LinkedList<Entrada<K, V>> bucket : tabla) {
            if (bucket != null) {
                for (Entrada<K, V> e : bucket) {
                    llaves.add(e.llave);
                }
            }
        }
        return llaves;
    }

    public List<V> values() {
        List<V> valores = new ArrayList<>();

        for (LinkedList<Entrada<K, V>> bucket : tabla) {
            if (bucket != null) {
                for (Entrada<K, V> e : bucket) {
                    valores.add(e.valor);
                }
            }
        }
        return valores;
    }
}
