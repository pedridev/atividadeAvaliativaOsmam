package Exercicio1.View;

import Exercicio1.Controller.Dados;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        // eu pensei em calcular o frete de uma loja de carro
        // que faz entregas por cegonha, calculando custo por km,
        // a distancia e a margem de lucro e etc.

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a distância : ");
        Double distancia = sc.nextDouble();

        System.out.println("Digite o valor da mercadoria : ");
        Double valorMercadoria = sc.nextDouble();

        System.out.println("Quanto a mercadoria pesa em Kilogramas? : ");
        Double pesoMercadoria = sc.nextDouble();

        System.out.println("Digite o valor do combustível por quilometro : ");
        Double combustivel = sc.nextDouble();

        System.out.println("Quais são as despesas eventuais deste veículo? (Se não houver despesas adicionais como seguro e/ou taxas, digite 0) : ");
        Double despesasEventuais = sc.nextDouble();

        System.out.println("Valor de venda : ");
        Double valorVenda = sc.nextDouble();

        sc.close();
        Dados controller = new Dados(distancia, valorMercadoria, pesoMercadoria, combustivel, despesasEventuais, valorVenda);
        controller.exibirResultados();
    }
}
