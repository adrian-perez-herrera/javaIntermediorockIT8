package ficheros.ejercicioPreExamen;

public class Aplicacion implements iGananciaNeta {

    private String nombre;
    private int cantidadUsuarios;
    private int costeMensual;

    public Aplicacion() {
        this.nombre = "";
        this.cantidadUsuarios = 0;
        this.costeMensual = 0;
    }

    @Override
    public String toString() {
        return "Aplicacion [nombre=" + nombre + ", cantidadUsuarios=" + cantidadUsuarios + ", costeMensual="
                + costeMensual + ", Ganancia neta= " + GananciaNeta() + ", usuariosAnuales= " + totalUsuariosAnuales()
                + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
    }

    public int getCosteMensual() {
        return costeMensual;
    }

    public void setCosteMensual(int costeMensual) {
        this.costeMensual = costeMensual;
    }

    public int GananciaNeta() {

        int cantidadNeta = getCantidadUsuarios() * getCosteMensual();

        return cantidadNeta;
    }

    public int totalUsuariosAnuales() {
        int total = getCantidadUsuarios() * 12;
        return total;
    }

}
