public class BilleteraParque {
    private int Tickets;
    private static boolean Festivo = false;

    public BilleteraParque(){
        Tickets = 0;
    }

    public BilleteraParque(int Tickets){
        this.Tickets = Tickets;
        }

    public int getTickets(){
        return Tickets;
    }

    public static boolean getFestivo(){
        return Festivo;
    }

    public void setTickets(int Tickets){
        if(Tickets >= 0){
           this.Tickets = Tickets;
        }
    }

    public  static void establecerFestivo(){
        Festivo = !Festivo;
    }

    public void agregarTickets(int cantidad){
        if(Tickets > 0){
            Tickets += cantidad;
        }
        }

    public boolean removerTickets(int cantidad){
        if(cantidad > 0 && Tickets > cantidad){
            Tickets -= cantidad;
            return true;
        }else{
            return false;
        }
    }


    }



