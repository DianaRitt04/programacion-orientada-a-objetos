import java.util.ArrayList;
import java.util.Scanner;

public class MenuPremios {
    private ArrayList <Premio> premios;

    public MenuPremios(){
        this.premios = new ArrayList<>();
    
    this.premios.add(new Premio("Camiseta", 150));
    this.premios.add(new Premio("Sombrero", 350));
    this.premios.add(new Premio("Tenis", 600));
}
    public void mostrarMenuPremios(boolean getFestivo){
        if(getFestivo){
            System.out.println("¡Precios de vacaciones!");
            for(int i = 0; i < this.premios.size(); i++){
                Premio p = this.premios.get(i);
                int costo = p.getCostoActual(getFestivo);
                System.out.println((i + 1) + ". " + p.getNombre() + " (" + costo + " tickets)");
            }
        }
    }

    public void procesarCompra(BilleteraParque billetera, Scanner sc) {
    boolean esFestivo = BilleteraParque.getFestivo();

    // 1. Mostrar el menú completo (incluyendo el mensaje festivo si aplica)
    this.mostrarMenuPremios(esFestivo); 
    
    System.out.print("¿Qué premio desea comprar? ");

    // 2. Lógica de lectura de la opción
    if (sc.hasNextInt()) { // Validación de entrada (mantenida por si acaso)
        int seleccion = sc.nextInt();
        sc.nextLine(); // Es crucial consumir el salto de línea

        int indicePremio = seleccion - 1;
        Premio premioSeleccionado = null; 
        int costo = 0; 

        if (indicePremio >= 0 && indicePremio < this.premios.size()) {
            
            premioSeleccionado = this.premios.get(indicePremio);
            costo = premioSeleccionado.getCostoActual(esFestivo); 

            // 3. Intentar comprar usando el objeto billetera (no la clase BilleteraParque)
            if (billetera.removerTickets(costo)) {
                System.out.println("Compré un " + premioSeleccionado.getNombre() + " por " + costo + " tickets");
                
                // Mostrar saldo restante (según requisito)
                System.out.println("Tu billetera tiene " + billetera.getTickets() + " boletos");

            } else {
                // 4. Compra fallida
                System.out.println("No hay suficientes boletos para comprar " + premioSeleccionado.getNombre());
            }
            
        } else {
            System.out.println("Opción de premio inválida.");
        }
    } else {
        System.out.println("Entrada inválida. Debe ser un número.");
        sc.next(); // Consumir entrada no válida
        sc.nextLine(); // Consumir el salto de línea
    }
}


}




