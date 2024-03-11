import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private final String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public static final char SEXO_HOMBRE = 'H';
    public static final char SEXO_MUJER = 'M';
    private static final double PESO_IDEAL_INFERIOR = 20;
    private static final double PESO_IDEAL_SUPERIOR = 25;

    public Persona() {
        this("", 0, SEXO_HOMBRE);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    private char comprobarSexo(char sexo) {
        return (sexo == SEXO_HOMBRE || sexo == SEXO_MUJER) ? sexo : SEXO_HOMBRE;
    }

    private String generaDNI() {
        Random rnd = new Random();
        int numDNI = rnd.nextInt(99999999 - 10000000 + 1) + 10000000;
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = numDNI % 23;
        return numDNI + tabla.charAt(modulo) + "";
    }

    public double calcularIMC() {
        if (altura == 0) return -1;
        double imc = peso / (altura * altura);
        if (imc < PESO_IDEAL_INFERIOR) {
            return -1; // Por debajo de peso ideal
        } else if (imc >= PESO_IDEAL_INFERIOR && imc <= PESO_IDEAL_SUPERIOR) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
