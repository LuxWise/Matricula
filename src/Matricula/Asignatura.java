package Matricula;

public class Asignatura {

    private int codigo;
    private String nombre;
    private String jornada;

    public Asignatura(int codigo, String nombre, String jornada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.jornada = jornada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}
