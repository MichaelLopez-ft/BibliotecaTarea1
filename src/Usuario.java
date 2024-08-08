public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String numeroIdentificacion;

    public Usuario(String nombre, String apellido, String email, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    //Mostrar informacón de usuario
    public String toString() {
        return nombre + " " + apellido + " (" + numeroIdentificacion + ")";
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
}

