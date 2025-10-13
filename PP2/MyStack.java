package PP2;
import java.util.ArrayList;

public class MyStack {

    private ArrayList<Character> myList = new ArrayList<Character>();
    private int CAPACITY = 10000;

    public void push(char c) {
        if (myList.size() < CAPACITY) {
            myList.add(c);
        } else {
            System.out.println("Error: pila llena");
        }
    }

    public char pop() {
        if (!myList.isEmpty()) {
            return myList.remove(myList.size() - 1);
        } else {
            System.out.println("Error: pila vacía");
            return ' '; // devuelve un espacio si no hay nada
        }
    }

    public boolean empty() {
        return myList.isEmpty();
    }

    // Saber cuántos elementos hay
    public int size() {
        return myList.size();
    }
    
}
