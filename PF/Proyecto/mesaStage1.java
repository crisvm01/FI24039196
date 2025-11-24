
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class mesaStage1 extends JFrame {

    private JLabel[] labelsCaja = new JLabel[52];
    private Caja caja;
    private Mazo mazo;
    private Mano mano;
    private Pozo pozo;
    private JLabel labelMazo;
    private JLabel[] labelsMano = new JLabel[8];
    private JLabel labelPozo;

    public mesaStage1() {
        setTitle("The Sandwich Guy - Mesa de Juego");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Creamos las estructuras
        caja = new Caja();
        mazo = new Mazo();
        mano = new Mano();
        pozo = new Pozo();

        //Panel para la Caja (Norte)
        JPanel panelCaja = new JPanel(new BorderLayout());
        JLabel tituloCaja = new JLabel("CAJA - Baraja Ordenada (52 cartas)", SwingConstants.CENTER);
        tituloCaja.setFont(new Font("Arial", Font.BOLD, 16));
        panelCaja.add(tituloCaja, BorderLayout.NORTH);

        JPanel panelCartas = new JPanel(new GridLayout(4, 13, 2, 2));
        for (int i = 0; i < 52; i++) {
            labelsCaja[i] = new JLabel("", SwingConstants.CENTER);
            labelsCaja[i].setFont(new Font("Arial", Font.BOLD, 14));
            labelsCaja[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelsCaja[i].setOpaque(true);
            labelsCaja[i].setBackground(Color.WHITE);
            labelsCaja[i].setPreferredSize(new Dimension(60, 90));
            panelCartas.add(labelsCaja[i]);
        }
        panelCaja.add(panelCartas, BorderLayout.CENTER);

        //Panel central: para mazo, mano y pozo
        JPanel panelCentral = new JPanel(new GridLayout(1, 3, 10, 0));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //Mazo al lado (Izquierda)
        JPanel panelMazo = new JPanel(new BorderLayout());
        JLabel tituloMazo = new JLabel("MAZO", SwingConstants.CENTER);
        tituloMazo.setFont(new Font("Arial", Font.BOLD, 16));
        panelMazo.add(tituloMazo, BorderLayout.NORTH);

        labelMazo = new JLabel("0 cartas", SwingConstants.CENTER);
        labelMazo.setFont(new Font("Arial", Font.BOLD, 18));
        labelMazo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        labelMazo.setOpaque(true);
        labelMazo.setBackground(new Color(240, 240, 240));
        labelMazo.setPreferredSize(new Dimension(120, 180));
        panelMazo.add(labelMazo, BorderLayout.CENTER);

        //Mano en el (Centro)
        JPanel panelMano = new JPanel(new BorderLayout());
        JLabel tituloMano = new JLabel("MANO - 8 Cartas", SwingConstants.CENTER);
        tituloMano.setFont(new Font("Arial", Font.BOLD, 16));
        panelMano.add(tituloMano, BorderLayout.NORTH);

        JPanel panelCartasMano = new JPanel(new GridLayout(1, 8, 5, 5));
        for (int i = 0; i < 8; i++) {
            labelsMano[i] = new JLabel("VACÍO", SwingConstants.CENTER);
            labelsMano[i].setFont(new Font("Arial", Font.BOLD, 14));
            labelsMano[i].setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            labelsMano[i].setOpaque(true);
            labelsMano[i].setBackground(Color.LIGHT_GRAY);
            labelsMano[i].setPreferredSize(new Dimension(80, 120));
            panelCartasMano.add(labelsMano[i]);
        }
        panelMano.add(panelCartasMano, BorderLayout.CENTER);

        //Pozo al lado (Derecha)
        JPanel panelPozo = new JPanel(new BorderLayout());
        JLabel tituloPozo = new JLabel("POZO", SwingConstants.CENTER);
        tituloPozo.setFont(new Font("Arial", Font.BOLD, 16));
        panelPozo.add(tituloPozo, BorderLayout.NORTH);

        labelPozo = new JLabel("0 cartas", SwingConstants.CENTER);
        labelPozo.setFont(new Font("Arial", Font.BOLD, 18));
        labelPozo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        labelPozo.setOpaque(true);
        labelPozo.setBackground(new Color(240, 240, 240));
        labelPozo.setPreferredSize(new Dimension(120, 180));
        panelPozo.add(labelPozo, BorderLayout.CENTER);

        panelCentral.add(panelMazo);
        panelCentral.add(panelMano);
        panelCentral.add(panelPozo);

        //Botón para poder barajar
        JPanel panelBoton = new JPanel();
        JButton barajar = new JButton("BARAJAR CARTAS");
        barajar.setFont(new Font("Arial", Font.BOLD, 18));
        barajar.setBackground(new Color(70, 130, 180));
        barajar.setForeground(Color.WHITE);
        barajar.setPreferredSize(new Dimension(200, 50));
        barajar.addActionListener(e -> barajarCartas());
        panelBoton.add(barajar);

        add(panelCaja, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);

        mostrarCartasCaja();
        actualizarOtrasSecciones();
    }

    private void mostrarCartasCaja() {
        List<Carta> lista = caja.toList();
        for (int i = 0; i < labelsCaja.length; i++) {
            if (i < lista.size()) {
                Carta carta = lista.get(i);
                labelsCaja[i].setText(carta.toString());
                if (carta.getColor().equals("rojo")) {
                    labelsCaja[i].setForeground(Color.RED);
                } else {
                    labelsCaja[i].setForeground(Color.BLACK);
                }
                labelsCaja[i].setBackground(Color.WHITE);
            } else {
                labelsCaja[i].setText("");
                labelsCaja[i].setBackground(Color.GRAY);
            }
        }
    }

    private void actualizarOtrasSecciones() {
        //Mazo
        labelMazo.setText("<html><center>MAZO<br>" + mazo.size() + "<br>cartas</center></html>");

        //Mano
        List<Carta> cartasMano = mano.toList();
        for (int i = 0; i < 8; i++) {
            if (i < cartasMano.size()) {
                Carta carta = cartasMano.get(i);
                labelsMano[i].setText(carta.toString());
                if (carta.getColor().equals("rojo")) {
                    labelsMano[i].setForeground(Color.RED);
                } else {
                    labelsMano[i].setForeground(Color.BLACK);
                }
                labelsMano[i].setBackground(Color.WHITE);
            } else {
                labelsMano[i].setText("VACÍO");
                labelsMano[i].setForeground(Color.GRAY);
                labelsMano[i].setBackground(Color.LIGHT_GRAY);
            }
        }

        //Pozo
        labelPozo.setText("<html><center>POZO<br>" + pozo.size() + "<br>cartas</center></html>");
    }

    private void barajarCartas() {
        //Mezclar la caja
        int mezclas = Math.max(200, caja.size() * 3);
        for (int i = 0; i < mezclas; i++) {
            int index = (int) (Math.random() * caja.size());
            Carta temp = caja.removeIndex(index);
            if (temp != null) {
                caja.agregarAlFinal(temp);
            }
        }

        //Transferir cartas de la caja al Mazo
        while (!caja.isEmpty()) {
            Carta c = caja.removeFirst();
            if (c != null) {
                mazo.push(c);
            }
        }

        //Sacar 8 cartas del mazo a la mano
        for (int i = 0; i < 8; i++) {
            if (mazo.isEmpty()) {
                break;
            }
            Carta c = mazo.pop();
            if (c != null) {
                mano.addLast(c);
            }
        }

        //Actualizar visual
        mostrarCartasCaja();
        actualizarOtrasSecciones();

        JOptionPane.showMessageDialog(this,
                "¡Cartas barajadas exitosamente!\n\n"
                + "Resumen:\n"
                + "• Cartas en Mazo: " + mazo.size() + "\n"
                + "• Cartas en Mano: " + mano.getSize() + "\n"
                + "• Cartas en Pozo: " + pozo.size(),
                "Barajado Completado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new mesaStage1().setVisible(true);
        });
    }
}
