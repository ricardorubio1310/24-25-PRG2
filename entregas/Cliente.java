package entregas;

import entregas.fernandezIbuprofeno.reto003.Calculadora;

public class Cliente {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.ingresarNumero(15);
        calculadora.ingresarNumero(15);
        calculadora.sumar();
        System.out.println(calculadora.mostrarTodo());
    }
}
