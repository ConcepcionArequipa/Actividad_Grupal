package ejemplo.metodos;

public class Calculadora {
    // Atributo de instancia o objeto
    private double numero;

    // Constructor con parametros
    public Calculadora(double numero) {
        this.numero = numero;
    }

    // Metodo de instancia: usa el atributo del objeto
    public double cuadrado() {
        return numero * numero;
    }

    // Metodo estático: no necesita objeto, recibe parámetros
    public static double suma(double a, double b) {
        return a + b;
    }
}
