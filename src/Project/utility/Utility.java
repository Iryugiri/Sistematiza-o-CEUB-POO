package Project.utility;

import java.util.List;
import java.util.Scanner;

import entity.Funcionario;

public class Utility {
	static Scanner scanner = new Scanner(System.in);
	
	public static Integer menu() {
    	System.out.println("Menu:"); 
        System.out.println("1. Adicionar funcionário");
        System.out.println("2. Pesquisar funcionário");
        System.out.println("3. Sair");
        System.out.print("Selecione uma opção:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
	
	public static Funcionario cadastrarFuncionario () {
		System.out.print("Digite o ID do funcionário:");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a Idade do funcionario");
        String idade = scanner.nextLine();
        
        System.out.print("Digite o e-mail do funcionário:");
        String email = scanner.nextLine();
        
        System.out.print("Digite o telefone do funcionário:");
        String telefone = scanner.nextLine();
        
        System.out.print("Digite as alergias do funcionário:");
        String alergia = scanner.nextLine();
        
        System.out.print("Digite as condições médicas do funcionário:");
        String condicaoMedica = scanner.nextLine();
        
        Funcionario funcionario = new Funcionario(id, nome, idade, email, telefone, alergia, condicaoMedica);
        return funcionario;
	}
	
	public static void acharFuncionario(List<Funcionario> func, Integer id) {
		Funcionario.searchFuncionario(func, id);
	}


}
