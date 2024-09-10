package Exercicio5.Controller;

import Exercicio5.Model.OrdenadorNumeros;

public class ControladorOrdenacao {
    private OrdenadorNumeros ordenadorNumeros;

    public ControladorOrdenacao(double num1, double num2, double num3) {
        this.ordenadorNumeros = new OrdenadorNumeros(num1, num2, num3);
    }

    public void exibirResultado() {
        double[] numerosOrdenados = ordenadorNumeros.ordenar();
        System.out.println("Números em ordem crescente: " + numerosOrdenados[0] + ", " + numerosOrdenados[1] + ", " + numerosOrdenados[2]);
    }
}
