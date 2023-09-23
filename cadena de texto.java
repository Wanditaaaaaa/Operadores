import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();
        boolean contieneA = false;
        boolean contieneB = false;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == 'a') {
                contieneA = true;
            } else if (caracter == 'b') {
                contieneB = true;
            }

            if (contieneA && contieneB) {
                break; 
            }
        }

        if (contieneA && contieneB) {
            System.out.println("La cadena contiene tanto 'a' como 'b'.");
        } else {
            System.out.println("La cadena no contiene tanto 'a' como 'b'.");
        }
    }
}