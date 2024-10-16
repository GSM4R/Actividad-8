public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private double peso;

    // Constructor
    public Perro(String nombre, String raza, int edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void comer(String tipoComida, double cantidad) {
        System.out.println(nombre + " está comiendo " + cantidad + " gramos de " + tipoComida + ".");

        this.peso += cantidad / 1000;
    }


    public String ladrar() {
        return "guau guau";
    }
}




