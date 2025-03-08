package src;

import src.calculadora.Calculadora;

public class ClienteCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(100);

        calculadora.ingresarNumero(5);
        calculadora.ingresarNumero(3);
        calculadora.sumar();       
        System.out.println(calculadora.mostrarTodo());

        calculadora.ingresarNumero(5);
        calculadora.ingresarNumero(3);
        calculadora.restar();       
        System.out.println(calculadora.mostrarTodo());

        calculadora.ingresarNumero(5);
        calculadora.ingresarNumero(3);
        calculadora.multiplicar();       
        System.out.println(calculadora.mostrarTodo());

        calculadora.ingresarNumero(45);
        calculadora.ingresarNumero(5);
        calculadora.dividir();       
        System.out.println(calculadora.mostrarTodo());

        calculadora.calcularSumatoria();
        System.out.println(calculadora.mostrarTodo());

        for(int i=0;i<15;i++){
            calculadora.ingresarNumero(Math.random()*100);
        }
        System.out.println(calculadora.mostrarTodo());

        calculadora.calcularMedia();
        System.out.println(calculadora.mostrarTodo());

        System.out.println("Constructor con valor inicial");
        calculadora = new Calculadora(100.0);
        System.out.println(calculadora.mostrarTodo());

        System.out.println("Constructor con valores iniciales");
        calculadora = new Calculadora(new double[] {1.0,2,0,3.0,4,0});
        System.out.println(calculadora.mostrarTodo());        

        System.out.println("Calcular porcentaje (20% de 100)");
        calculadora = new Calculadora(new double[] {100.0,20.0});
        calculadora.calcularPorcentaje();
        System.out.println(calculadora.mostrarTodo());        

        System.out.println("Calcular factorial");
        calculadora = new Calculadora(0.0);
        System.out.println(calculadora.mostrarTodo()); 
        calculadora.calcularFactorial();
        System.out.println(calculadora.mostrarTodo()); 

    }
}
