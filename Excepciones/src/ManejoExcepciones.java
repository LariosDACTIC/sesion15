import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {

    public static int contador = 0;

    // demuestra el lanzamiento de una excepción cuando ocurre una división entre
    // cero
    public static int cociente(int numerador, int denominador) {
        return numerador / denominador; // posible división entre cero
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, este es un ejemplo de la sesion 14 Excepciones");

        Scanner leer = new Scanner(System.in);

        boolean continuar = true;

        do {

            try {

                if (contador <= 3) {
                    // Bloque de codigo donde puede ocurrir la excepcion
                    System.out.println("Ingrese numerador entero");
                    int numerador = leer.nextInt();
                    System.out.println("Ingrese denominador entero");
                    int denominador = leer.nextInt();

                    System.out.println("Resultado del llamado al metodo " + cociente(numerador, denominador));

                    continuar = false;
                } else {

                    System.out.println("llego al limte de errores aritmeticos");
                    continuar = false;
                }

            } catch (InputMismatchException inputMismatchException) {

                // Bloque de codigo donde se maneja la excepcion

                System.out.println(inputMismatchException);
                leer.nextLine();
                System.out.println("debe introducir un valor entero, intente otra vez ");

            } catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException);
                System.out.println("Cero es un denominador invalido");
                contador++;

            } finally {
                System.out.println("Este es el  bloque que siempre ocurre ");
                
            }

        } while (continuar);

        leer.close();

        // Casos de prueba

        // ejecucion correcta con numerador y denominador
        // ejecucion con denominador 0
        // ejecucion con denominador String

    }
}
