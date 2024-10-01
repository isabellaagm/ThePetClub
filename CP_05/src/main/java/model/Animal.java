package model;

public class Animal {

	private int idAnimal;
	private int idTutor;
	private String nome;
	private String raca;
	private String cor;
	private int idade;
	private String genero;
	
	
	public Animal() {
	}

	public Animal(int idAnimal, int idTutor, String nome, String raca, String cor, int idade, String genero) {
		this.idAnimal = idAnimal;
		this.idTutor = idTutor;
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
		this.genero = genero;
	}

	public int getIdTutor() {
		return idTutor;
	}

	public void setIdTutor(int idTutor) {
		this.idTutor = idTutor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
