import java.util.Scanner; // importa la clase Scanner para leer datos

public class Main { // clase principal del programa

    public static void main(String[] args) { // metodo principal del programa
        
        Scanner scanner = new Scanner(System.in); // crea objeto para leer datos

        // solicitud de datos al usuario
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine(); //String cadena para leer texto

        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        int cilindrada = scanner.nextInt(); // int para leer numeros
        scanner.nextLine(); // salto de linea

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad de pasajeros: ");
        int pasajeros = scanner.nextInt();

        // mostrar datos en salida
        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");

        scanner.close(); // cierre d eel scanner
    }
}