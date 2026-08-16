import java.time.LocalDate;

public class Parqueadero {

    private int tarifaHora;
    private int contadorTiquetes;
    private Vehiculo vehiculoActual;
    
    public Parqueadero() {
        tarifaHora = 5000;
        contadorTiquetes = 1;
        vehiculoActual = null;
    }

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

    public int getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public Vehiculo getVehiculoActual() {
        return vehiculoActual;
    }
}