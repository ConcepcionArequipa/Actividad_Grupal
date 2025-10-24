package ejemplo.encapsulamiento;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", 500);

        // Consultar saldo
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        // Depositar dinero
        cuenta.depositar(200);

        // Retirar dinero
        cuenta.retirar(100);

        // Cambiar nombre del titular
        cuenta.setNombre("Juan Armijos");
        System.out.println("Nuevo titular: " + cuenta.getNombre());
    }
}
