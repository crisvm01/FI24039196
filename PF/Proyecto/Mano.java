
import java.util.ArrayList;
import java.util.List;

public class Mano {

    private static class Node {

        Carta data;
        Node next;

        Node(Carta c) {
            data = c;
        }
    }

    private Node tail;
    private int size;

    public Mano() {
        tail = null;
        size = 0;
    }

    public void addLast(Carta c) {
        if (c == null) {
            return;
        }
        if (size >= 8) {
            return;
        }
        Node n = new Node(c);
        if (tail == null) {
            tail = n;
            tail.next = n;
        } else {
            n.next = tail.next;
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public List<Carta> toList() {
        List<Carta> list = new ArrayList<>();
        if (tail == null) {
            return list;
        }
        Node cur = tail.next;
        for (int i = 0; i < size; i++) {
            list.add(cur.data);
            cur = cur.next;
        }
        return list;
    }

    public void clear() {
        tail = null;
        size = 0;
    }
}
