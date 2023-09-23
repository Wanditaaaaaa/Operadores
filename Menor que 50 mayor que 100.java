import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero < 50 || numero > 100) {
            System.out.println("El número es menor que 50 o mayor que 100.");
        } else {
            System.out.println("El número está en el rango de 50 a 100 (inclusive).");
        }
    }
}