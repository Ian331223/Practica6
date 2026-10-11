import java.util.Scanner;

public class Ej1P6 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, t, r, z=1;
        System.out.println("Ingrese la tabla de multiplicar que quiere ver:");
        t=read.nextInt();
        System.out.println("Ingresecuantas multiplicaciones quiere ver:");
        n=read.nextInt();
        while(z<=n)
        {
            r=t*z;
            System.out.println(t + " x " + z + " = " + r);
            z++;
        }
        read.close();
    }
    
}
