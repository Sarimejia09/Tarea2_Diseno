// Clase Main: programa de prueba para la CuentaBancaria
// Aca se muestra que la cuenta ya no permite saldo negativo
// ni modificaciones directas de sus atributos

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Carlos");

        // Antes se podia hacer: cuenta.dinero = -500;
        // Ahora eso ni siquiera compila, porque saldo es privado.
        // La unica forma de mover el dinero es con depositar() y retirar()

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        System.out.println();

        cuenta.depositar(1000);   // deposito valido
        cuenta.retirar(300);      // retiro valido
        cuenta.retirar(900);      // retiro invalido: no alcanza el saldo
        cuenta.depositar(-200);   // deposito invalido: monto negativo
        System.out.println();

        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
