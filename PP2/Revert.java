package PP2;

import java.io.FileReader;
import java.io.FileWriter;

public class Revert {
   
    public static void main(String[] args) throws Exception {
        MyStack pila = new MyStack ();
         FileReader lector = new FileReader("C:\\Users\\emend\\OneDrive\\Desktop\\Programacion Intermedia\\PracticaEvaluada\\input.txt");
         //En la fila de arriba coloque donde esta ubicado el archivo input.txt
        int c;

        // Leer archivo y meter caracteres en la pila
        while ((c = lector.read()) != -1) {
            pila.push((char) c);
        }

        lector.close();

        
        FileWriter escritor = new FileWriter("output.txt");

        while (!pila.empty()) {
            escritor.write(pila.pop());
        }

        escritor.close();

        System.out.println("Archivo invertido correctamente en output.txt");
    
    }
}
