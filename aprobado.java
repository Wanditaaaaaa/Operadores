import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la nota del estudiante: ");
        int nota = sc.nextInt();

        if (nota >= 60 && nota <= 100) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante ha reprobado.");
        }
    }
}






