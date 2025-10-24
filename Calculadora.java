public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    public String mostrarResultado(int a, int b) {
        int resultado = sumar(a, b);
        return "El resultado es: " + resultado;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.mostrarResultado(5, 3));
    }
}