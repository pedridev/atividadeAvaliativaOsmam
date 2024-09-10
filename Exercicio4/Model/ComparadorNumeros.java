package Exercicio4.Model;

public class ComparadorNumeros {
    private double num1;
    private double num2;
    private double num3;

    public ComparadorNumeros(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double encontrarMaior() {
        return Math.max(num1, Math.max(num2, num3));
    }

    public double encontrarMenor() {
        return Math.min(num1, Math.min(num2, num3));
    }
}
