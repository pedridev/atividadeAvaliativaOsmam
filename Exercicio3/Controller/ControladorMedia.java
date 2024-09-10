package Exercicio3.Controller;

import Exercicio3.Model.CalculadoraMedia;

public class ControladorMedia {
    private CalculadoraMedia calculadoraMedia;

    public ControladorMedia(double nota1, double nota2, double nota3, double nota4) {
        this.calculadoraMedia = new CalculadoraMedia(nota1, nota2, nota3, nota4);
    }

    public void exibirResultado() {
        double media = calculadoraMedia.calcularMedia();
        System.out.println("Média das notas: " + media);
    }
}
