
package ventanas;

/**
 *
 * @author Camilo
 */
public class Factura1 {
     private  int fecha;
    private int Num_fac;
    private int Num_clien;
    private String titular;
    private String Tipo_cuanta;
    private String Localizacion;
    private String Total_Fac;
    private int telefono;

    public Factura1() {
    }

    public Factura1(int fecha, int Num_fac, int Num_clien, String titular, String Tipo_cuanta, String Localizacion, String Total_Fac, int telefono) {
        this.fecha = fecha;
        this.Num_fac = Num_fac;
        this.Num_clien = Num_clien;
        this.titular = titular;
        this.Tipo_cuanta = Tipo_cuanta;
        this.Localizacion = Localizacion;
        this.Total_Fac = Total_Fac;
        this.telefono = telefono;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getNum_fac() {
        return Num_fac;
    }

    public void setNum_fac(int Num_fac) {
        this.Num_fac = Num_fac;
    }

    public int getNum_clien() {
        return Num_clien;
    }

    public void setNum_clien(int Num_clien) {
        this.Num_clien = Num_clien;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipo_cuanta() {
        return Tipo_cuanta;
    }

    public void setTipo_cuanta(String Tipo_cuanta) {
        this.Tipo_cuanta = Tipo_cuanta;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    public String getTotal_Fac() {
        return Total_Fac;
    }

    public void setTotal_Fac(String Total_Fac) {
        this.Total_Fac = Total_Fac;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
     
}
