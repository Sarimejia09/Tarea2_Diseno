// Clase Libro tal como aparece en el enunciado de la actividad

public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public void prestar() {
        if (!this.prestado) {
            this.prestado = true;
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("El libro ya estaba prestado.");
        }
    }
}
