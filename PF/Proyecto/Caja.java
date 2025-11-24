
import java.util.ArrayList;
import java.util.List;

public class Caja {

    private static class Node {

        Carta data;
        Node prev, next;

        Node(Carta c) {
            data = c;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Caja() {
        head = tail = null;
        size = 0;
        crearBarajaOrdenada();
    }

    public void agregarAlFinal(Carta c) {
        Node n = new Node(c);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    private void crearBarajaOrdenada() {
        String[] palos = {"Corazones", "Diamantes", "Picas", "Tréboles"};
        String[] colores = {"rojo", "rojo", "negro", "negro"};
        String[] nombres = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Jota", "Reina", "Rey"};
        String[] simbolos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < 13; j++) {
                Carta c = new Carta(palos[i], colores[i], j + 1, nombres[j], simbolos[j]);
                agregarAlFinal(c);
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Carta removeFirst() {
        if (head == null) {
            return null;
        }
        Carta c = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return c;
    }

    public Carta removeIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Carta c = cur.data;
        if (cur.prev != null) {
            cur.prev.next = cur.next;
        } else {
            head = cur.next;
        }
        if (cur.next != null) {
            cur.next.prev = cur.prev;
        } else {
            tail = cur.prev;
        }
        size--;
        return c;
    }

    public Carta removeRandom() {
        if (size == 0) {
            return null;
        }
        int index = (int) (Math.random() * size);
        return removeIndex(index);
    }

    public Carta get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.data;
    }

    public List<Carta> toList() {
        List<Carta> list = new ArrayList<>();
        Node cur = head;
        while (cur != null) {
            list.add(cur.data);
            cur = cur.next;
        }
        return list;
    }
}
