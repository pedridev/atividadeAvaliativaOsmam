package Exercicio2.Controller;

import Exercicio2.Model.CalculadoraTinta;

public class ControladorTinta {
    private CalculadoraTinta calculadoraTinta;

    public ControladorTinta(double largura, double altura) {
        this.calculadoraTinta = new CalculadoraTinta(largura, altura);
    }

    public void exibirResultados() {
        int numeroLatas = calculadoraTinta.calcularNumeroLatas();
        System.out.println("Número de latas necessárias: " + numeroLatas);
    }
}
