import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.print("¿Tienes un permiso de conducir? (true/false): ");
        boolean tienePermiso = sc.nextBoolean();

        if (edad >= 18 && tienePermiso) {
            System.out.println("La persona es mayor de edad y tiene un permiso de conducir.");
        } else {
            System.out.println("La persona no es mayor de edad o no tiene un permiso de conducir.");
        }
    }
}