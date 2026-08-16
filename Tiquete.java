import java.time.LocalDate;

public class Tiquete {

    private String codigo;  
    private LocalDate fecha;

    public Tiquete(String codigo, LocalDate fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return "Código: " + codigo + ", Fecha: " + fecha;
    }
}