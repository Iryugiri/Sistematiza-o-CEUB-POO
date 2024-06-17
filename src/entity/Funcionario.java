package entity;

import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	static Scanner scanner = new Scanner(System.in);
	
	public Funcionario (Integer id, String nome, String idade, String email, String telefone, String alergia, String condicaoMedica) {
		super(id, nome, idade, email, telefone, alergia, condicaoMedica);
	}
	
	public static void searchFuncionario(List<Funcionario> lista, Integer id) {
        for (Funcionario funcionario : lista) {
        	if (funcionario.getId() == id) {
                    System.out.println("ID: " + funcionario.getId());   
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Idade: " + funcionario.getIdade());
                    System.out.println("E-mail: " + funcionario.getEmail());
                    System.out.println("Telefone: " + funcionario.getTelefone());
                    System.out.println("Alergias: " + funcionario.getAlergia());
                    System.out.println("Condições Médicas: " + funcionario.getCondicaoMedica());
            } else {
            	System.out.println("Funcionário não encontrado.");
            }
        }
    }

	@Override
	public String toString() {
		return "Func []";
	}
}

	
	
	

