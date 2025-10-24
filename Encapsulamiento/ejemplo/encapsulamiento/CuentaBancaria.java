package ejemplo.encapsulamiento;

public class CuentaBancaria {
    // Atributos privados
    private String nombre;
    private double saldo;

    // Constructor con parametros
    public CuentaBancaria(String nombre, double saldoInicial) {
        this.nombre = nombre;
        //Validacion del saldo inicial
        if(saldoInicial >= 0){
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido.");
        }
    }

    // Métodos públicos para acceder y modificar los atributos

    public String getNombre() {
        return nombre;
    }

    // Metodo setter para cambiar el nombre de la cuenta

    public void setNombre(String nuevoNombre) {
        if(nuevoNombre != null && !nuevoNombre.isEmpty()){
            this.nombre = nuevoNombre;
        } else {
            System.out.println("Nombre invalido.");
        }
    }
    // Metodo getter para acceder al saldo
    public double getSaldo() {
        return saldo;
    }


    // Metodo para depositar dinero

    public void depositar(double cantidad) {
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad invalida para depósito.");
        }
    }

    // Metodo para retirar dinero
    public void retirar(double cantidad) {
        if(cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad invalida o saldo insuficiente.");
        }
    }
}
