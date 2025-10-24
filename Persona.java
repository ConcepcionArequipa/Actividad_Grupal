public class Persona {

    public void saludar() {
        System.out.println("Hola desde un método de instancia.");
    }


    public static void info() {
        System.out.println("Método estático de la clase Persona.");
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.saludar();
        Persona.info();
        System.out.println(Math.sqrt(16));
    }
}