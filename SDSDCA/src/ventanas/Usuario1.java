
package ventanas;

/**
 *
 * @author Camilo
 */
public class Usuario1 {
      private String ID;
    private String nombre;
    private String apellidos;
    private String  Tipo_ID;//Menu de Seleccionar
    private String Departamento;//Menu de Seleccionar
    private String Municipio;//Menu de Seleccionar
    private String Fecha_Nam ;//Menu de Seleccionar
    private Long Telefono;
    private String Correo;

    public Usuario1() {
    }

    public Usuario1(String ID, String nombre, String apellidos, String Tipo_ID, String Departamento, String Municipio, String Fecha_Nam, Long Telefono, String Correo) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Tipo_ID = Tipo_ID;
        this.Departamento = Departamento;
        this.Municipio = Municipio;
        this.Fecha_Nam = Fecha_Nam;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo_ID() {
        return Tipo_ID;
    }

    public void setTipo_ID(String Tipo_ID) {
        this.Tipo_ID = Tipo_ID;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getFecha_Nam() {
        return Fecha_Nam;
    }

    public void setFecha_Nam(String Fecha_Nam) {
        this.Fecha_Nam = Fecha_Nam;
    }

    public Long getTelefono() {
        return Telefono;
    }

    public void setTelefono(Long Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
