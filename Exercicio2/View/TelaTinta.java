package Exercicio2.View;

import Exercicio2.Controller.ControladorTinta;
import java.util.Scanner;

public class TelaTinta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a largura da parede (em metros): ");
        double largura = sc.nextDouble();

        System.out.println("Insira a altura da parede (em metros): ");
        double altura = sc.nextDouble();

        sc.close();

        // Criar e usar o Controlador
        ControladorTinta controladorTinta = new ControladorTinta(largura, altura);
        controladorTinta.exibirResultados();
    }
}