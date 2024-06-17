package entity;

class Pessoa {
    private Integer id;
    private String nome;
    private String idade;
    private String email;
    private String telefone;
    private String alergia;
    private String condicaoMedica;

    public Pessoa(Integer id, String nome, String idade, String email, String telefone, String alergia, String condicaoMedica) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.alergia = alergia;
        this.condicaoMedica = condicaoMedica;
    }

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getAlergia() {
		return alergia;
	}

	public String getCondicaoMedica() {
		return condicaoMedica;
	}

    
}
