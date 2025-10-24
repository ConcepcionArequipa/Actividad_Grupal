package ejemplo.parametros;

public class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
