package Matricula;

public class Asignatura {

    private int codigo = 0;
    private String nombre = "";
    private String jornada = "";
    private  String franja = "";

    public Asignatura(int codigo, String nombre, String jornada, String franja) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.jornada = jornada;
        this.franja = franja;
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

    public String getFranja() {
        return franja;
    }

    public void setFranja(String franja) {
        this.franja = franja;
    }
}
