import java.time.LocalDate;

/**
 * Representa el parqueadero y administra el ingreso
 * de los vehículos.
 */
public class Parqueadero {

    private int tarifaHora;
    private int contadorTiquetes;
    private Vehiculo vehiculoActual;

    /**
     * Constructor del parqueadero.
     *
     * Inicializa la tarifa en $5.000 por hora.
     */
    public Parqueadero() {
        tarifaHora = 5000;
        contadorTiquetes = 1;
        vehiculoActual = null;
    }

    /**
     * Registra el ingreso de un vehículo.
     *
     * @param placa placa del vehículo
     * @param marca marca del vehículo
     * @param horaIngreso hora de ingreso entre 0 y 23
     * @return vehículo registrado
     */
    public Vehiculo registrarIngreso(String placa, String marca, int horaIngreso) {

        String codigo = "T" + String.format("%03d", contadorTiquetes);

        Tiquete nuevoTiquete = new Tiquete(
                codigo,
                LocalDate.now()
        );

        Vehiculo nuevoVehiculo = new Vehiculo(
                placa,
                marca,
                horaIngreso,
                nuevoTiquete
        );

        vehiculoActual = nuevoVehiculo;

        contadorTiquetes++;

        return nuevoVehiculo;
    }

    /**
     * Obtiene la tarifa por hora del parqueadero.
     *
     * @return tarifa por hora
     */
    public int getTarifaHora() {
        return tarifaHora;
    }

    /**
     * Modifica la tarifa por hora.
     *
     * @param tarifaHora nueva tarifa
     */
    public void setTarifaHora(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    /**
     * Obtiene el vehículo registrado actualmente.
     *
     * @return vehículo actual
     */
    public Vehiculo getVehiculoActual() {
        return vehiculoActual;
    }
}
