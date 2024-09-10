package Exercicio1.Model;

public class Calculadora {
    private double distancia;
    private double valorMercadoria;
    private double pesoMercadoria;
    private double combustivel;
    private double despesasEventuais;
    private double valorVenda;

    public Calculadora(double distancia, double valorMercadoria, double pesoMercadoria, double combustivel, double despesasEventuais, double valorVenda) {
        this.distancia = distancia;
        this.valorMercadoria = valorMercadoria;
        this.pesoMercadoria = pesoMercadoria;
        this.combustivel = combustivel;
        this.despesasEventuais = despesasEventuais;
        this.valorVenda = valorVenda;
    }

    public double calcularCustoTotal() {
        double custoFrete = distancia * combustivel;
        return valorMercadoria + custoFrete + despesasEventuais;
    }

    public double calcularPercentualLucro() {
        double custoTotal = calcularCustoTotal();
        double lucro = valorVenda - custoTotal;
        return (lucro / custoTotal) * 100;
    }

    // Getters e Setters

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorMercadoria() {
        return valorMercadoria;
    }

    public void setValorMercadoria(double valorMercadoria) {
        this.valorMercadoria = valorMercadoria;
    }

    public double getPesoMercadoria() {
        return pesoMercadoria;
    }

    public void setPesoMercadoria(double pesoMercadoria) {
        this.pesoMercadoria = pesoMercadoria;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getDespesasEventuais() {
        return despesasEventuais;
    }

    public void setDespesasEventuais(double despesasEventuais) {
        this.despesasEventuais = despesasEventuais;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
