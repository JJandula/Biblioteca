import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca material = new Biblioteca();

        String opcion;
        do {
            System.out.println(" ========== MENU BIBLIOTECA ============: ");
            System.out.println("1. Crear Libro");
            System.out.println("2. Crear Revista");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Prestar");
            System.out.println("5. devolver");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {   
                 

            } while (!opcion.equals("6"));
   }
}
