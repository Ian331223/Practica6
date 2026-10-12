package p6ej3;

public class Saldo {
    // Saldo compartido entre las clases (inicia en 0.0 o el valor que prefieras)
    private static double saldoActual = 1000.0; 

    public static double getSaldoActual() {
        return saldoActual;
    }

    public static void setSaldoActual(double saldoActual) {
        Saldo.saldoActual = saldoActual;
    }

    public static void consultarSaldo() {
        System.out.println("\nSu saldo actual es: $" + saldoActual);
    }
}
