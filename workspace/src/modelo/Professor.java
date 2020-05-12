package modelo;

public class Professor {
	private String nome;
	private String apelido;
	private String materia;
	private Endereco endereco;

	// Construtor vazio
	public Professor() {
		System.out.println("Instanciou o professor");
	}
	// Construtor cheio
	public Professor(String nome, String apelido, String materia, Endereco endereco) {
		this.nome = nome;
		this.apelido = apelido;
		this.materia = materia;
		this.endereco = endereco;
	}

	public String getAll() {
		return nome + "\n" + apelido + "\n" + materia + "\n" + endereco.getAll(); 
	}
	
	public void setAll(String nome, String apelido, String materia, Endereco endereco) {
		this.nome = nome;
		this.apelido = apelido;
		this.materia = materia;
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	

}
