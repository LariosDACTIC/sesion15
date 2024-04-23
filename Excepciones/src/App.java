import java.util.Scanner;

public class App {

    // demuestra el lanzamiento de una excepción cuando ocurre una división entre
    // cero
    public static int cociente(int numerador, int denominador) {
        return numerador / denominador; // posible división entre cero
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, este es un ejemplo de la sesion 15 Excepciones");

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numerador entero");
        int numerador = leer.nextInt();
        System.out.println("Ingrese denominador entero");
        int denominador = leer.nextInt();

        System.out.println("Resultado del llamado al metodo " + cociente(numerador, denominador));

        leer.close();

        //Casos de prueba
        
        //ejecucion correcta con numerador y denominador
        //ejecucion con denominador 0
        //ejecucion con denominador String

    }
}
