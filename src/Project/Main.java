package Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class pessoa {
    private String id;
    private String nome;
    private String idade;
    private String email;
    private String telefone;
    private String alergia;
    private String condicaoMedica;

    public pessoa(String id, String nome, String idade, String email, String telefone, String alergia, String condicaoMedica) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.alergia = alergia;
        this.condicaoMedica = condicaoMedica;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getnome() {
        return nome;
    }
    
    public String getidade() {
    	return idade;
    }

    public String getEmail() {
        return email;
    }

    public String gettelefone() {
        return telefone;
    }

    public String getalergia() {
        return alergia;
    }

    public String getcondicaoMedica() {
        return condicaoMedica;
    }
}

class funcionario extends pessoa {
	public funcionario (String id, String nome, String idade, String email, String telefone, String alergia, String condicaoMedica) {
		super(id, nome, idade, email, telefone, alergia, condicaoMedica);
	}
	
}

class sistemaFuncionario {
    private Map<String, funcionario> funcionarios;

    public sistemaFuncionario() {
        funcionarios = new HashMap<>();
    }

    public void addfuncionario(funcionario funcionario) {
        funcionarios.put(funcionario.getId(), funcionario);
    }

    public funcionario getfuncionario(String id) {
        return funcionarios.get(id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sistemaFuncionario system = new sistemaFuncionario();

        while (true) {
        	
            System.out.println("Selecione uma opção:");
            
            System.out.println("1. Adicionar funcionário");
            
            System.out.println("2. Pesquisar funcionário");
            
            System.out.println("3. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Digite o ID do funcionário:");
                    String id = scanner.nextLine();
                    
                    System.out.println("Digite o nome do funcionário:");
                    String nome = scanner.nextLine();
                    
                    System.out.println("Digite a Idade do funcionario");
                    String idade = scanner.nextLine();
                    
                    System.out.println("Digite o e-mail do funcionário:");
                    String email = scanner.nextLine();
                    
                    System.out.println("Digite o telefone do funcionário:");
                    String telefone = scanner.nextLine();
                    
                    System.out.println("Digite as alergias do funcionário:");
                    String alergia = scanner.nextLine();
                    
                    System.out.println("Digite as condições médicas do funcionário:");
                    String condicaoMedica = scanner.nextLine();

                    funcionario newfuncionario = new funcionario(id, nome, idade, email, telefone, alergia, condicaoMedica);
                    system.addfuncionario(newfuncionario);
                    System.out.println("Funcionário adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o ID do funcionário:");
                    String searchId = scanner.nextLine();

                    funcionario acharFuncionario = system.getfuncionario(searchId);
                    if (acharFuncionario != null) {
                        System.out.println("ID: " + acharFuncionario.getId());
                        
                        System.out.println("Nome: " + acharFuncionario.getnome());
                        
                        System.out.println("Idade: " + acharFuncionario.getidade());
                        
                        System.out.println("E-mail: " + acharFuncionario.getEmail());
                        
                        System.out.println("Telefone: " + acharFuncionario.gettelefone());
                        
                        System.out.println("Alergias: " + acharFuncionario.getalergia());
                        
                        System.out.println("Condições Médicas: " + acharFuncionario.getcondicaoMedica());
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        }
    }
}