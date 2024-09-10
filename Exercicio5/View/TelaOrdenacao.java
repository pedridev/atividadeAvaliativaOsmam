package Exercicio5.View;

import Exercicio5.Controller.ControladorOrdenacao;
import java.util.Scanner;

public class TelaOrdenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        sc.close();

        // Criar e usar o Controlador
        ControladorOrdenacao controladorOrdenacao = new ControladorOrdenacao(num1, num2, num3);
        controladorOrdenacao.exibirResultado();
    }
}

