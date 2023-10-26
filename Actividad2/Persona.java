package ficheros.Actividad2;

public class Persona extends Comidafavorita {

    String nombre = "Adrian";
    String apellido = "Perez";
    String puestoLaboral = "Software Developer";
    String ciudad = "Madrid";

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", puestoLaboral=" + puestoLaboral + ", ciudad="
                + ciudad + " Comida favorita: " + comidafavorita;
    }

}
