package Exercicio2.Model;

public class CalculadoraTinta {
    private double largura;
    private double altura;
    private final double CONSUMO_POR_METRO_QUADRADO = 300;
    private final double LITROS_POR_LATA = 2;
    private final double ML_POR_LITRO = 1000;

    public CalculadoraTinta(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularQuantidadeTintaNecessaria() {
        double area = largura * altura;
        double quantidadeTintaNecessaria = area * CONSUMO_POR_METRO_QUADRADO;
        return quantidadeTintaNecessaria;
    }

    public int calcularNumeroLatas() {
        double quantidadeTintaNecessaria = calcularQuantidadeTintaNecessaria();
        double quantidadePorLata = LITROS_POR_LATA * ML_POR_LITRO;
        return (int) Math.ceil(quantidadeTintaNecessaria / quantidadePorLata);
    }

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
