public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int añoPublicacion;
    private int numeroPaginas;

    //Atributos de la clase
    public Libro (String titulo, String autor, String editorial, int añoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }
    //Mostrar información de los libros
    public String toString() {
        return titulo + " - " + autor + " (" + añoPublicacion + ")";
    }
}
