import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        String nombreUsuarioValido = "usuario123";
        String contrasenaValida = "contrasena123";

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String nombreUsuario = sc.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contrasena = sc.nextLine();

        if (nombreUsuario.equals(nombreUsuarioValido) && contrasena.equals(contrasenaValida)) {
            System.out.println("Acceso concedido. Bienvenido, " + nombreUsuario);
        } else {
            System.out.println("Acceso denegado. Nombre de usuario o contraseña incorrectos.");
        }
    }
}
