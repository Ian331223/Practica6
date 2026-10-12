package p6ej3;

import java.util.Scanner;

public class Retirar {

    public static void realizarRetiro(Scanner read) {
        System.out.print("\nIngrese la cantidad a retirar: $");
        double cantidad = read.nextDouble();
        
        if (cantidad > 0) {
            if (cantidad <= Saldo.getSaldoActual()) {
                double nuevoSaldo = Saldo.getSaldoActual() - cantidad;
                Saldo.setSaldoActual(nuevoSaldo);
                System.out.println("¡Retiro exitoso! Su nuevo saldo es: $" + Saldo.getSaldoActual());
            } else {
                System.out.println("Fondos insuficientes. No cuenta con saldo suficiente para este retiro.");
            }
        } else {
            System.out.println("Cantidad inválida. Debe ser mayor a 0.");
        }
    }
}
