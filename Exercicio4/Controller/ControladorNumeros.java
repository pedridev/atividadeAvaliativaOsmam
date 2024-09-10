package Exercicio4.Controller;

import Exercicio4.Model.ComparadorNumeros;

public class ControladorNumeros {
    private ComparadorNumeros comparadorNumeros;

    public ControladorNumeros(double num1, double num2, double num3) {
        this.comparadorNumeros = new ComparadorNumeros(num1, num2, num3);
    }

    public void exibirResultado() {
        double maior = comparadorNumeros.encontrarMaior();
        double menor = comparadorNumeros.encontrarMenor();

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
