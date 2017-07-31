package Inicio;

public class Registro {

    private int matricula;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;

    public Registro() {

    }

    public Registro(int Matricula, String Nombre, String Apellido, int Edad, String Carrera) {
        this.matricula=Matricula;
        this.nombre=Nombre;
        this.apellido=Apellido;
        this.edad=Edad;
        this.carrera=Carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
