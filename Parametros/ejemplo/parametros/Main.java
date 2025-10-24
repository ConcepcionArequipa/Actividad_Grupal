package ejemplo.parametros;

public class Main {
    // Metodo que intenta cambiar un tipo primitivo (paso por valor)
    static void cambiarNumero(int num) {
        num = num + 10;
        System.out.println("Dentro de cambiarNumero: " + num);
    }

    // Metodo que cambia un objeto (paso por referencia)
    static void cambiarNombre(Persona p) {
        p.nombre = "Carlos";
        System.out.println("Dentro de cambiarNombre: " + p.nombre);
    }

    public static void main(String[] args) {
        // Paso por valor con tipo primitivo
        int numero = 5;
        System.out.println("Antes de cambiarNumero: " + numero);
        cambiarNumero(numero);
        System.out.println("Después de cambiarNumero: " + numero);

        System.out.println("------");

        // Paso por referencia con objeto
        Persona persona = new Persona("Ana");
        persona.mostrarNombre();
        cambiarNombre(persona);
        persona.mostrarNombre();
    }
}
