import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible por 2 y por 3.");
        } else {
            System.out.println("El número no es divisible por 2 y por 3.");
        }
    }
}





