package Matricula;

public class Grupo {
    private int codigo = 0;
    private int cupo = 0;
    private String consecutivoMateria = "";

    public Grupo(int codigo, int cupo, String consecutivoMateria) {
        this.codigo = codigo;
        this.cupo = cupo;
        this.consecutivoMateria = consecutivoMateria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getConsecutivoMateria() {
        return consecutivoMateria;
    }

    public void setConsecutivoMateria(String consecutivoMateria) {
        this.consecutivoMateria = consecutivoMateria;
    }
}
