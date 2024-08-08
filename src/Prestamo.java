import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
    }

    public void devolverLibro() {
        this.fechaDevolucion = LocalDate.now();
    }

    //Mostrar la información del préstamo
    public String toString() {
        return "Prestamo: " + libro + " a " + usuario + " el " + fechaPrestamo + (fechaDevolucion != null ? ", devuelto el " + fechaDevolucion : "");
    }

    public Object getLibro() {
        return libro;
    }

    public Object getUsuario() {
        return usuario;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
}

