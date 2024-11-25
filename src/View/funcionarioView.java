package View;

import Controller.funcionarioController;
import Model.funcionario;

import java.util.Scanner;

public class funcionarioView {
    public static void main(String[] args) {
        funcionarioController controller = new funcionarioController();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Cadastro de Funcionários ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline

            switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cargo: ");
                String cargo = scanner.nextLine();
                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                controller.cadastrarFuncionario(nome, cargo, salario);
                System.out.println("Funcionário cadastrado com sucesso!");
                break;

            case 2:
                System.out.println("\n--- Lista de Funcionários ---");
                for (funcionario func : controller.listarFuncionarios()) {
                    System.out.println(func);
                }
                break;

            case 3:
                System.out.print("ID do Funcionário: ");
                int idAtualizar = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Novo Nome: ");
                String novoNome = scanner.nextLine();
                System.out.print("Novo Cargo: ");
                String novoCargo = scanner.nextLine();
                System.out.print("Novo Salário: ");
                double novoSalario = scanner.nextDouble();
                if (controller.atualizarFuncionario(idAtualizar, novoNome, novoCargo, novoSalario)) {
                    System.out.println("Funcionário atualizado com sucesso!");
                } else {
                    System.out.println("Funcionário não encontrado!");
                }
                break;

            case 4:
                System.out.print("ID do Funcionário: ");
                int idExcluir = scanner.nextInt();
                if (controller.excluirFuncionario(idExcluir)) {
                    System.out.println("Funcionário excluído com sucesso!");
                } else {
                    System.out.println("Funcionário não encontrado!");
                }
                break;

            case 5:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
