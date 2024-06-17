package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Project.utility.Utility;
import entity.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        Boolean rodando = true;
        
        while (rodando) {
        	
            int choice = Utility.menu();

            switch (choice) {
                case 1:
                	Funcionario funcionario = Utility.cadastrarFuncionario();
                	funcionarios.add(funcionario);
                    System.out.println("Funcionário adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o ID do funcionário:");
                    Integer searchId = scanner.nextInt();
                    Utility.acharFuncionario(funcionarios, searchId);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        }
    }
    
    
    
}