import java.util.Calendar;


public class Animal {

    private String especie;
    private String raza;
    private String nombre;
    private int edad;
    private String fechaNac;
    private Calendar fechaIng;
    private String dueño;

    public Animal(String especie, String raza, int edad, String fechaNac, String fechaIng, String nombre) {

        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
        this.fechaNac = fechaNac;
        this.dueño = "";
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Calendar getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Calendar fechaIng) {
        this.fechaIng = fechaIng;
    }

    @Override
    public String toString() {
        return "Protectora.Animal{" + "nombre= " + nombre + "especie=" + especie + ", raza=" + raza + ", edad=" + edad + ", fechaNac=" + fechaNac + ", fechaIng=" + fechaIng.getTime().toString() + ", dueño=" + dueño + '}';
    }

}
