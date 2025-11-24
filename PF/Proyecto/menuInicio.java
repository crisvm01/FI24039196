
import javax.swing.*;
import java.awt.*;

public class menuInicio extends JFrame {

    public menuInicio() {
        setTitle("The Sandwich Guy");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JLabel titulo = new JLabel("The Sandwich Guy", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        JLabel subtitulo = new JLabel("Descarta cartas formando tripletas", SwingConstants.CENTER);
        JButton iniciar = new JButton("Iniciar Partida");
        JButton continuar = new JButton("Continuar Partida");

        iniciar.addActionListener(e -> {
            new mesaStage1().setVisible(true);
            this.dispose();
        });

        add(titulo);
        add(subtitulo);
        add(iniciar);
        add(continuar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new menuInicio().setVisible(true);
        });
    }
}
