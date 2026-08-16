public class Vehiculo {
        
        private String placa;
        private String marca;
        private int horaIngreso;
        private Tiquete tiquete;

    public Vehiculo(String placa, String marca, int horaIngreso, Tiquete tiquete) {

            this.placa = placa;
            this.marca = marca;
            this.horaIngreso = horaIngreso;
            this.tiquete = tiquete;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca (String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso (int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Tiquete tiquete() {
        return tiquete;
    }

    public void setTiquete (Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public int calcularCobro(int horaSalida, int tarifaHora) {

        int horasTranscurridas = horaSalida - horaIngreso;

        return horasTranscurridas * tarifaHora;
    }

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