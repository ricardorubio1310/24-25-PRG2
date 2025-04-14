import java.util.Scanner;

public class InterfazPolinomios {
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        System.out.println("Ingrese el grado del polinomio:");
        int grado = scanner.nextInt();

        double[] coeficientes = new double[grado + 1];
        for (int i = grado; i >= 0; i--) {
            System.out.print("Coeficiente de x^" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        Polinomio polinomio = new Polinomio(coeficientes);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Mostrar polinomio");
            System.out.println("2. Derivar");
            System.out.println("3. Integrar");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> polinomio.mostrar();
                case 2 -> CalculadoraPolinomios.derivar(polinomio).mostrar();
                case 3 -> CalculadoraPolinomios.integrar(polinomio).mostrar();
                case 4 -> continuar = false;
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
