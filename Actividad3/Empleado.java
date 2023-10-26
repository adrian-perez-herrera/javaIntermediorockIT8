package ficheros.Actividad3;

public class Empleado extends Persona implements iSueldoFinal {

    int id;
    String cargo;
    int antiguedad;
    Double sueldo;

    public Empleado(String nombre, String apellido, String ciudad, String nacimiento, int id, String cargo,
            int antiguedad, Double sueldo) {
        super(nombre, apellido, ciudad, nacimiento);
        this.id = id;
        this.cargo = cargo;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", cargo=" + cargo + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + "]"
                + nombre + " " + apellido + " " + ciudad + " " + nacimiento;
    }

    @Override
    public void calculoSueldofinal(double sueldo) {
        System.out.println("El sueldo tras los descuentos es :" + sueldo / 0.8);
    }

}
