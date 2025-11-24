
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pozo {

    private Queue<Carta> queue;

    public Pozo() {
        queue = new LinkedList<>();
    }

    public void enqueue(Carta c) {
        if (c != null) {
            queue.add(c);
        }
    }

    public Carta dequeue() {
        return queue.poll();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public List<Carta> toList() {
        return new java.util.ArrayList<>(queue);
    }
}

