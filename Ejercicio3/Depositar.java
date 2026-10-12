package p6ej3;

import java.util.Scanner;

public class Depositar {

    public static void realizarDeposito(Scanner read) {
        System.out.print("\nIngrese la cantidad a depositar: $");
        double cantidad = read.nextDouble();
        
        if (cantidad > 0) {
            double nuevoSaldo = Saldo.getSaldoActual() + cantidad;
            Saldo.setSaldoActual(nuevoSaldo);
            System.out.println("¡Depósito exitoso! Su nuevo saldo es: $" + Saldo.getSaldoActual());
        } else {
            System.out.println("Cantidad inválida. Debe ser mayor a 0.");
        }
    }
}
