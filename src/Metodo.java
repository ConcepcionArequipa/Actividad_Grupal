public class Metodo {

    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static void main(String[] args) {
        double base = 5.0;
        double altura = 3.0;

        double resultado = calcularArea(base, altura);

        System.out.println("El área del rectángulo es: " + resultado);
    }
}
