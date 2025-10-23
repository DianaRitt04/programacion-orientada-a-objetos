import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
       
        BilleteraParque billetera = new BilleteraParque(100); 
        Scanner scanner = new Scanner(System.in);
        MenuOpciones menuOpciones = new MenuOpciones();
        MenuPremios menuPremios = new MenuPremios();
        
        boolean salir = false;
        int opcion = 0;

        
        
        while (!salir) {
            
            
            menuOpciones.mostrarMenu(billetera.getTickets());
            
            
            opcion = menuOpciones.obtenerOpcion(scanner); 
            
            switch (opcion) {
                case 1: 
                    System.out.print("¿Cuántos boletos se agregan? ");
                    if (scanner.hasNextInt()) {
                        int cantidad = scanner.nextInt();
                        billetera.agregarTickets(cantidad);
                        
                       
                        System.out.println("Tu billetera tiene " + billetera.getTickets() + " boletos"); 
                    } else {
                        System.out.println("Entrada inválida.");
                    }
                    scanner.nextLine(); 
                    break;
                    
                case 2: 
                    System.out.print("Establecer saldo de tickets en: ");
                    if (scanner.hasNextInt()) {
                        int nuevoSaldo = scanner.nextInt();
                        billetera.setTickets(nuevoSaldo);
                        
                        
                        System.out.println("Tu billetera tiene " + billetera.getTickets() + " boletos");
                    } else {
                        System.out.println("Entrada inválida.");
                    }
                    scanner.nextLine(); 
                    break;
                    
                case 3: 
                    menuPremios.procesarCompra(billetera, scanner); 
                    break;
                    
                case 4: 
                    BilleteraParque.establecerFestivo(); 
                    
                
                    if (BilleteraParque.getFestivo()) {
                        System.out.println("Ahora es un día festivo.");
                    } else {
                        System.out.println("Ya no es un día festivo.");
                    }
                    break;
                    
                case 5: 
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            
            System.out.println(); 
        }
        
        
        scanner.close();
    }
}
    

