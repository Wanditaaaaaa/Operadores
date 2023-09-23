import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else if (numero == 0) {
            System.out.println("El número es igual a cero.");
        } else {
            System.out.println("El número es positivo.");
        }
    }
}
