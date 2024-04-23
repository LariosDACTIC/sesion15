public class Trows {

    public static void main(String[] args) {

        try {
            lanzamientoexcepcion();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void lanzamientoexcepcion() throws Exception {

        System.out.println("mensaje dentro del metodo");

        int edad = 17;

        if (edad < 18) {
            throw new Exception("Excepcion creada por ser menor de edad");
        } else {
            System.out.println("es mayor de edad");
        }

    }


    
}
