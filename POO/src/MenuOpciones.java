import java.util.Scanner;

public class MenuOpciones {

    Scanner sc = new Scanner(System.in);
    int opcion = sc.nextInt();

    
    public void mostrarMenu(int tickets) {
        System.out.println("==Administrador de billeteras para parques temáticos=="); 
        System.out.println("1. Agregar Tickets");
        System.out.println("2. Establecer Tickets");
        System.out.println("3. Comprar premio");
        System.out.println("4. Establecer festivo");
        System.out.println("5. Salir");
        
        
        System.out.println("Tu billetera tiene " + tickets + " boletos"); 
        System.out.print("Ingrese la opción: ");
    }
    
    public int obtenerOpcion (Scanner sc) {
    if (sc.hasNextInt()) {
        int opcion = sc.nextInt(); // <--- Aquí se declara
        return opcion;
    } else {
        sc.next(); // Consumir entrada no válida
        return -1; // Devolver valor de error
    }
}
}