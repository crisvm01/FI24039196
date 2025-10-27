public class Numbers {

    private static double N = 25;

    public static double formula(double z) {
        return round((z + Math.sqrt(4 + Math.pow(z, 2))) / 2);
    }

    public static double recursive(double z) {
        return round(recursive(z, N) / recursive(z, N - 1));
    }

    public static double iterative(double z) {
        return round(iterative(z, N) / iterative(z, N - 1));
    }

    private static double recursive(double z, double n) {
        if (n == 0 || n == 1){
            return 1;
        } else{
            return z * recursive(z, n - 1) + recursive(z, n - 2);}
    }

    private static double iterative(double z, double n) {
        if (n == 0 || n == 1){
            return 1;
        }

        double anterior2 = 1;
        double anterior1 = 1;
        double valorActual = 1;

        for (int i = 2; i <= n; i++){
            valorActual = z* anterior1 + anterior2;
            anterior2 = anterior1;
            anterior1 = valorActual;
        }
        return valorActual;
    }

    private static double round(double value) {
        var ROUND = 10000000000.0;
        return Math.round(value * ROUND) / ROUND;
    }

    public static void main(String[] args) {
        String[] metallics = {
                "Platinum", // [0]
                "Golden", // [1]
                "Silver", // [2]
                "Bronze", // [3]
                "Copper", // [4]
                "Nickel", // [5]
                "Aluminum", // [6]
                "Iron", // [7]
                "Tin", // [8]
                "Lead", // [9]
        };
        for (var z = 0; z < metallics.length; z++) {
            System.out.println("\n[" + z + "] " + metallics[z]);
            System.out.println(" ↳ formula(" + z + ")   ≈ " + formula(z));
            System.out.println(" ↳ recursive(" + z + ") ≈ " + recursive(z));
            System.out.println(" ↳ iterative(" + z + ") ≈ " + iterative(z));
        }
    }
}