import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero > 10 && numero < 20) {
            System.out.println("El número está en el rango de 10 a 20.");
        } else {
            System.out.println("El número no está en el rango de 10 a 20.");
        }
    }
}