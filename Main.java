import java.util.Scanner;

/**
 * Clase principal del sistema de estacionamiento.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        System.out.println("+================================+");
        System.out.println("|        AUTOPARK CENTRAL        |");
        System.out.println("|   Sistema de Estacionamiento   |");
        System.out.println("+================================+");

        System.out.print("Ingrese la placa del vehiculo: ");
        String placa = sc.nextLine();

        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese la hora de ingreso del vehiculo: ");
        int horaIngreso = sc.nextInt();

        while(horaIngreso < 0 || horaIngreso > 23) {
            System.out.println("La hora debe estar entre 0 y 23");
            System.out.println("Ingrese una hora valida: ");
            System.out.print("Ingrese la hora de ingreso del vehiculo: ");
            horaIngreso = sc.nextInt();
        }

        Vehiculo vehiculo = parqueadero.registrarIngreso(
                placa,
                marca,
                horaIngreso
        );

        System.out.println();
        System.out.println("+================================+");
        System.out.println("|       INGRESO REGISTRADO       |");
        System.out.println("+================================+");

        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Hora de ingreso: " + vehiculo.getHoraIngreso());

        System.out.println("Código del tiquete: "
                + vehiculo.getTiquete().getCodigo());

        System.out.println("Fecha: "
                + vehiculo.getTiquete().getFecha());

        // Pedir hora de salida
        System.out.println();
        System.out.print("Ingrese la hora de salida (0-23): ");
        int horaSalida = sc.nextInt();

        // Validar hora de salida
        while (horaSalida < 0 || horaSalida > 23
                || horaSalida < horaIngreso) {

            if (horaSalida < 0 || horaSalida > 23) {
                System.out.println("La hora debe estar entre 0 y 23.");
            } else {
                System.out.println(
                        "La hora de salida no puede ser menor "
                        + "que la hora de ingreso."
                );
            }

            System.out.print("Ingrese nuevamente la hora de salida: ");
            horaSalida = sc.nextInt();
        }

        // Calcular el cobro
        int total = vehiculo.calcularCobro(
                horaSalida,
                parqueadero.getTarifaHora()
        );

        // Mostrar resultado
        System.out.println();
        System.out.println("+================================+");
        System.out.println("|             COBRO              |");
        System.out.println("+================================+");

        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Hora de ingreso: " + horaIngreso);
        System.out.println("Hora de salida: " + horaSalida);
        System.out.println("Horas a pagar: " + (horaSalida-horaIngreso));
        System.out.println("Tarifa por hora: $"
                + parqueadero.getTarifaHora());
        System.out.println("Total a pagar: $" + total);

        System.out.println("+================================+");
        System.out.println("|      Gracias por utilizar      |");
        System.out.println("|        AUTOPARK CENTRAL        |");
        System.out.println("+================================+");

        sc.close();
    }
}
