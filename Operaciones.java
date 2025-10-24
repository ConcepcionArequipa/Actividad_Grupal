public class Operaciones {
    public int sumar(int a, int b){
        return a + b;
    }
    public void mostrarSuma(){
        int r = sumar(3, 7); // llama otro método
        System.out.println("Resultado: " + r);
    }
}
