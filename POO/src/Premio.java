public class Premio {
    private String Nombre;
    private int CostoBase;

    public Premio(String Nombre, int CostoBase){
        this.Nombre = Nombre;
        this.CostoBase = CostoBase;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public int getCostoActual(boolean getFestivo){
        if(getFestivo = true){
            return CostoBase/2;
        }else{
            return CostoBase;
        }
    }

}
