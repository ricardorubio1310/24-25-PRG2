package src.calculadora;

public class App {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(100);

        calculadora.ingresarNumero(5);
        calculadora.ingresarNumero(4);
        calculadora.ingresarNumero(3);
        calculadora.ingresarNumero(2);
        calculadora.ingresarNumero(1);
        calculadora.sumar();
        
        System.out.println(calculadora.mostrarTodo());

    }
}
