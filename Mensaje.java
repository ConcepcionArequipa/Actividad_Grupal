public class Mensaje {
    public void enviar(String texto){
        System.out.println("Mensaje: " + texto);
    }
    public void enviar(String texto, String nombre){
        System.out.println("Enviando '" + texto + "' a " + nombre);
    }
}