public class PalabrasClaves {

    public static void saludar(String nombre) {
        System.out.println("Holii, " + nombre + "bienvenid@ a mi casita.");
    }

    // Función que devuelve el resultado de multiplicar dos números
    public static int multiplicar(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado; // Devuelve el valor al main
    }

    public static void main(String[] args) {
        // Llamada al metodo con un parametro
        saludar("Josselyn");

//  Explicacion de metodo
//  public → el metodo se puede usar desde cualquier parte.
//  static → se puede ejecutar sin crear un objeto.
//  void → no devuelve nada, solo ejecuta una acción.
//  nombre del metodo: saludar
//  parámetro: (String nombre) → se usa para recibir el nombre.
//  no tiene return, porque solo imprime un mensaje.

        int a = 6;
        int b = 4;

        // Llamada a la función y guardamos el valor devuelto
        int producto = multiplicar(a, b);

        System.out.println("El resultado de la multiplicación es: " + producto);

        // Explicacion de funcion
//  public → accesible desde cualquier parte.
//  static → pertenece a la clase, no necesita objeto.
//  int → tipo de retorno, la función devuelve un número entero.
//  nombre de la función: multiplicar
//  parámetros: (int num1, int num2)
//  return resultado; → devuelve el valor calculado al main.
    }

}
