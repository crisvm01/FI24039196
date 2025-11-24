
import java.util.ArrayList;
import java.util.List;

public class Mazo {

    private List<Carta> stack;

    public Mazo() {
        stack = new ArrayList<>();
    }

    public void push(Carta c) {
        if (c != null) {
            stack.add(c);
        }
    }

    public Carta pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public Carta peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public List<Carta> toList() {
        return new ArrayList<>(stack);
    }
}
