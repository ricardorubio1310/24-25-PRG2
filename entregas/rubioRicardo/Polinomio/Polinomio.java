

public class Polinomio {
    private double[] coeficientes;

    public Polinomio(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public void mostrar() {
        for (int i = coeficientes.length - 1; i >= 0; i--) {
            double c = coeficientes[i];
            if (c != 0) {
                System.out.print((c > 0 && i != coeficientes.length - 1 ? " + " : "") + c);
                if (i > 0) System.out.print("x" + (i > 1 ? "^" + i : ""));
            }
        }
        System.out.println();
    }

    public double[] getCoeficientes() {
        return coeficientes;
    }
}