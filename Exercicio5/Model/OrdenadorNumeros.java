package Exercicio5.Model;

import java.util.Arrays;

public class OrdenadorNumeros {
    private double[] numeros;

    public OrdenadorNumeros(double num1, double num2, double num3) {
        this.numeros = new double[]{num1, num2, num3};
    }

    public double[] ordenar() {
        Arrays.sort(numeros);
        return numeros;
    }
}
