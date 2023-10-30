package ficheros.Examen;

public class Libro {

    private int idcliente;
    private String nombre;
    private String genero;
    private int fechaPublicacion;
    private String estadoSolicitud;

    public Libro(int idcliente, String nombre, String genero, int fechaPublicacion, String estadoSolicitud) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.estadoSolicitud = estadoSolicitud;
    }

    @Override
    public String toString() {
        return "Libro [idcliente=" + idcliente + ", nombre=" + nombre + ", genero=" + genero + ", fechaPublicacion="
                + fechaPublicacion + ", estadoSolicitud=" + estadoSolicitud + " fechaActualPedido="
                + fechaActualPedido() + " Segmentacion= " + segmentacion() + "]";
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public int fechaActualPedido() {
        int fechaActual = 2023;
        return fechaPublicacion - fechaActual;

    }

    public String segmentacion() {

        String segmentacion;
        if (estadoSolicitud.equals("ENTREGADO")) {

            segmentacion = "Cliente al dia";

        } else {

            segmentacion = "Cliente no está al día";
        }

        return segmentacion;

    }

}
