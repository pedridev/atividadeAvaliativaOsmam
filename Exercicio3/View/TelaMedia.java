package Exercicio3.View;

import Exercicio3.Controller.ControladorMedia;
import java.util.Scanner;

public class TelaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        sc.close();

        ControladorMedia controladorMedia = new ControladorMedia(nota1, nota2, nota3, nota4);
        controladorMedia.exibirResultado();

    }
}