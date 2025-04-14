

public class CalculadoraPolinomios {

    public static Polinomio derivar(Polinomio p) {
        double[] coef = p.getCoeficientes();
        if (coef.length == 1) return new Polinomio(new double[]{0});

        double[] derivada = new double[coef.length - 1];
        for (int i = 1; i < coef.length; i++) {
            derivada[i - 1] = coef[i] * i;
        }
        return new Polinomio(derivada);
    }

    public static Polinomio integrar(Polinomio p) {
        double[] coef = p.getCoeficientes();
        double[] integral = new double[coef.length + 1];
        integral[0] = 0; // constante de integracion

        for (int i = 0; i < coef.length; i++) {
            integral[i + 1] = coef[i] / (i + 1);
        }
        return new Polinomio(integral);
    }
}
