package Matricula;

public class Grupo {
    private int codigo = 0;
    private int cupo = 0;

    private String consecutivo = "";

    public Grupo(int codigo, int cupo, String consecutivo) {
        this.codigo = codigo;
        this.cupo = cupo;
        this.consecutivo = consecutivo;
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

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }
}
