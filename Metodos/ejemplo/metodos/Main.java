package ejemplo.metodos;

public class Main {
    public static void main(String[] args) {
        // Usando metodo estático
        double resultadoSuma = Calculadora.suma(5, 10); // llamamos directamente con la clase
        System.out.println("Suma: " + resultadoSuma);

        // Usando metodo de instancia
        Calculadora calculadora1 = new Calculadora(4); // creamos un objeto de la clase
        double resultadoCuadrado = calculadora1.cuadrado(); // llamamos al metodo usando el objeto
        System.out.println("Cuadrado: " + resultadoCuadrado);
    }
}
