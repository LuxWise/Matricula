package Matricula;

public class Documento {
    private String tipoDocumento = "";
    private int numeroDocuemnto = 0;

    public Documento(String tipoDocumento, int numeroDocuemnto) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocuemnto = numeroDocuemnto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocuemnto() {
        return numeroDocuemnto;
    }

    public void setNumeroDocuemnto(int numeroDocuemnto) {
        this.numeroDocuemnto = numeroDocuemnto;
    }
}