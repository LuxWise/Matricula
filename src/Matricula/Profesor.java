package Matricula;

public class Profesor {
    private String nombre = "";
    private String apellido = "";
    private  String email ="";
    private int codigo = 0;

    public Profesor(String nombre, String apellido, String email, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
