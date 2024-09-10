package Exercicio4.View;

import Exercicio4.Controller.ControladorNumeros;
import java.util.Scanner;

public class TelaNumeros {
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
        ControladorNumeros controladorNumeros = new ControladorNumeros(num1, num2, num3);
        controladorNumeros.exibirResultado();
    }
}
