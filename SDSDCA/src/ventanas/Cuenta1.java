
package ventanas;

/**
 *
 * @author Camilo
 */
public class Cuenta1 {
    
    private int numero_de_cuenta;
    private int saldo;
    private String titular;
    private String Servicios_de_cuenta;
    private int intereses = 15;
    private String Metodos_de_Pago;

    public Cuenta1() {
    }

    public Cuenta1(int numero_de_cuenta, int saldo, String titular, String Servicios_de_cuenta, String Metodos_de_Pago) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.Servicios_de_cuenta = Servicios_de_cuenta;
        this.Metodos_de_Pago = Metodos_de_Pago;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getServicios_de_cuenta() {
        return Servicios_de_cuenta;
    }

    public void setServicios_de_cuenta(String Servicios_de_cuenta) {
        this.Servicios_de_cuenta = Servicios_de_cuenta;
    }

    public int getIntereses() {
        return intereses;
    }

    public void setIntereses(int intereses) {
        this.intereses = intereses;
    }

    public String getMetodos_de_Pago() {
        return Metodos_de_Pago;
    }

    public void setMetodos_de_Pago(String Metodos_de_Pago) {
        this.Metodos_de_Pago = Metodos_de_Pago;
    }
    
    
}
