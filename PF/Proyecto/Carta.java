
public class Carta {

    private int valor;
    private String simbolo;
    private String nombre;
    private String palo;
    private String color;

    public Carta(String palo, String color, int valor, String nombre, String simbolo) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    @Override
    public String toString() {
        String simboloPalo = "";
        switch (palo) {
            case "Corazones":
                simboloPalo = "♥";
                break;
            case "Diamantes":
                simboloPalo = "♦";
                break;
            case "Picas":
                simboloPalo = "♠";
                break;
            case "Tréboles":
                simboloPalo = "♣";
                break;
        }
        return simbolo + simboloPalo;
    }
}
