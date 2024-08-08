import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "Editorial A", 1605, 920);
        Libro libro2 = new Libro("El Gato Negro", "Edgar Allan Poe", "Editorial B", 1843, 224);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Registrar usuarios
        Usuario usuario1 = new Usuario("Michael", "López", "michael.lopez@ejemplo.com", "123");
        Usuario usuario2 = new Usuario("Alberto", "García", "alberto.garcia@ejemplo.com", "456");
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar préstamos
        biblioteca.realizarPrestamo(libro1, usuario1);
        biblioteca.realizarPrestamo(libro2, usuario2);

        // Consultar préstamos activos
        List<Prestamo> prestamosActivos = biblioteca.consultarPrestamosActivos();
        for (Prestamo prestamo : prestamosActivos) {
            System.out.println(prestamo);
        }

        // Devolver libros
        biblioteca.devolverLibro(libro1, usuario1);
        biblioteca.devolverLibro(libro2, usuario2);

        // Consultar préstamos activos después de la devolución
        prestamosActivos = biblioteca.consultarPrestamosActivos();
        for (Prestamo prestamo : prestamosActivos) {
            System.out.println(prestamo);
        }
    }
}

