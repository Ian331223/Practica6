package p6ej3;

import java.util.Scanner;

public class P6ej3 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int resp;
        
        System.out.println("Bienvenido, ¿Qué desea hacer?");
        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1) Ver saldo");
            System.out.println("2) Depositar");
            System.out.println("3) Retirar");
            System.out.println("4) Salir");
            System.out.print("Elija una opción: ");
            resp = read.nextInt();
            
            switch(resp) {
                case 1:
                    Saldo.consultarSaldo();
                    break;
                case 2:
                    Depositar.realizarDeposito(read);
                    break;
                case 3:
                    Retirar.realizarRetiro(read);
                    break;
                case 4:
                    System.out.println("Cerrando el perfil, tenga un excelente día");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese otra");
                    break;
            }
        } while(resp != 4);
        
        read.close();
    }
}
