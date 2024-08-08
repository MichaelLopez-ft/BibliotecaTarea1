import java.time.LocalDate;
import java.util.*;

public class Biblioteca {
    private List<Libro> libros;
    private Map<String, Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new HashMap<>();
        prestamos = new ArrayList<>();
    }

    // Métodos para gestionar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public List<Libro> buscarLibro(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.toString().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> listarLibros() {
        return new ArrayList<>(libros);
    }

    // Métodos para gestionar usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public Usuario consultarUsuario(String numeroIdentificacion) {
        return usuarios.get(numeroIdentificacion);
    }

    public void actualizarUsuario(String numeroIdentificacion, Usuario usuarioActualizado) {
        usuarios.put(numeroIdentificacion, usuarioActualizado);
    }

    // Métodos para gestionar préstamos
    public void realizarPrestamo(Libro libro, Usuario usuario) {
        Prestamo prestamo = new Prestamo(libro, usuario, LocalDate.now());
        prestamos.add(prestamo);
    }

    public void devolverLibro(Libro libro, Usuario usuario) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.getUsuario().equals(usuario) && prestamo.getFechaDevolucion() == null) {
                prestamo.devolverLibro();
                break;
            }
        }
    }

    public List<Prestamo> consultarPrestamosActivos() {
        List<Prestamo> activos = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getFechaDevolucion() == null) {
                activos.add(prestamo);
            }
        }
        return activos;
    }
}

