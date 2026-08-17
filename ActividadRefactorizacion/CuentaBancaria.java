// Actividad: Refactorizacion de codigo (De Espagueti a POO)
// Clase CuentaBancaria: version encapsulada y orientada a objetos
// del codigo mal diseñado "BancoMalo"

public class CuentaBancaria {

    // Atributos privados: ya nadie puede modificarlos directamente desde afuera
    private String titular;
    private double saldo;

    // Constructor: la cuenta nace con un titular y saldo en cero
    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // Getters: solo permiten VER la informacion, no cambiarla
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Depositar: solo se aceptan montos positivos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Deposito exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor a cero.");
        }
    }

    // Retirar: se valida que el monto sea positivo y que alcance el saldo
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor a cero.");
        } else if (monto > saldo) {
            // Aqui se evita que la cuenta quede en saldo negativo
            System.out.println("Error: saldo insuficiente. Tu saldo es $" + saldo);
        } else {
            saldo = saldo - monto;
            System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
        }
    }
}
