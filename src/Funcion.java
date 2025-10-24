public class Funcion {

    public static int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado; // Devuelve la suma
    }

    public static void main(String[] args) {
        int a = 18;
        int b = 6;

        int suma = sumar(a, b);

        System.out.println("La suma de los números es: " + suma);
    }
}
