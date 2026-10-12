public class PrimerosPrimos {

    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;

        System.out.println("Los primeros 10 numeros primos son:");

        while (contador < 10) {
            boolean esPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }
}
