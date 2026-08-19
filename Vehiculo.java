/**
 * Representa un vehículo que ingresa al parqueadero.
 */
public class Vehiculo {
        
        private String placa;
        private String marca;
        private int horaIngreso;
        private Tiquete tiquete;

        /**
     * Constructor de la clase Vehiculo.
     *
     * @param placa placa del vehículo
     * @param marca marca del vehículo
     * @param horaIngreso hora de ingreso entre 0 y 23
     * @param tiquete tiquete asignado al vehículo
     */
    public Vehiculo(String placa, String marca, int horaIngreso, Tiquete tiquete) {

            this.placa = placa;
            this.marca = marca;
            this.horaIngreso = horaIngreso;
            this.tiquete = tiquete;
    }

    /**
     * Obtiene la placa del vehículo.
     *
     * @return placa del vehículo
     */
    public String getPlaca() {
        return placa;
    }

        /**
     * Modifica la placa del vehículo.
     *
     * @param placa nueva placa
     */
    public void setPlaca (String placa) {
        this.placa = placa;
    }

        /**
     * Obtiene la marca del vehículo.
     *
     * @return marca del vehículo
     */
    public String getMarca() {
        return marca;
    }

        /**
     * Modifica la marca del vehículo.
     *
     * @param marca nueva marca
     */
    public void setMarca (String marca) {
        this.marca = marca;
    }

        /**
     * Obtiene la hora de ingreso.
     *
     * @return hora de ingreso
     */
    public int getHoraIngreso() {
        return horaIngreso;
    }

        /**
     * Modifica la hora de ingreso.
     *
     * @param horaIngreso nueva hora de ingreso
     */
    public void setHoraIngreso (int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

        /**
     * Obtiene el tiquete asociado al vehículo.
     *
     * @return tiquete del vehículo
     */
    public Tiquete tiquete() {
        return tiquete;
    }

        /**
     * Modifica el tiquete asociado al vehículo.
     *
     * @param tiquete nuevo tiquete
     */
    public void setTiquete (Tiquete tiquete) {
        this.tiquete = tiquete;
    }

        /**
     * Calcula el valor que debe pagar el vehículo.
     *
     * @param horaSalida hora de salida entre 0 y 23
     * @param tarifaHora tarifa cobrada por cada hora
     * @return valor total a pagar
     */
    public int calcularCobro(int horaSalida, int tarifaHora) {

        int horasTranscurridas = horaSalida - horaIngreso;

        return horasTranscurridas * tarifaHora;
    }

        /**
     * Muestra la información del vehículo.
     *
     * @return información del vehículo
     */
    public Tiquete getTiquete() {
        return tiquete;
    }

    public String toString() {
        return "Placa: " + placa
                + "\nMarca: " + marca
                + "\nHora de ingreso: " + horaIngreso
                + "\nTiquete: " + tiquete;
    }
}
