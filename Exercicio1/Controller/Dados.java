package Exercicio1.Controller;

import Exercicio1.Model.Calculadora;

public class Dados {
    private Calculadora calculadora;

    public Dados(double distancia, double valorMercadoria, double pesoMercadoria, double combustivel, double despesasEventuais, double valorVenda) {
        this.calculadora = new Calculadora(distancia, valorMercadoria, pesoMercadoria, combustivel, despesasEventuais, valorVenda);
    }

    public void exibirResultados() {
        double custoTotal = calculadora.calcularCustoTotal();
        double percentualLucro = calculadora.calcularPercentualLucro();

        System.out.println("Custo Total: R$ " + custoTotal);
        System.out.println("Percentual de Lucro: " + percentualLucro + "%");
    }
}
