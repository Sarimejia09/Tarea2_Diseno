import java.time.LocalDate;

/**
 * Representa el tiquete entregado a un vehículo al ingresar
 * al parqueadero.
 */
public class Tiquete {

    private String codigo;  
    private LocalDate fecha;

    /**
     * Constructor de la clase Tiquete.
     *
     * @param codigo código único del tiquete
     * @param fecha fecha de creación del tiquete
     */
    public Tiquete(String codigo, LocalDate fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
    }

    /**
     * Obtiene el código del tiquete.
     *
     * @return código del tiquete
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Modifica el código del tiquete.
     *
     * @param codigo nuevo código
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la fecha del tiquete.
     *
     * @return fecha del tiquete
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Modifica la fecha del tiquete.
     *
     * @param fecha nueva fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Muestra la información del tiquete.
     *
     * @return información del tiquete
     */
    public String toString() {
        return "Código: " + codigo + ", Fecha: " + fecha;
    }
}
