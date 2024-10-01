package model;

public class Colaborador {

	
	private int idColaborador;
	private  String nome;
	private  String cpf;
	private String senha;
	
	public Colaborador() {
		
	}

	public Colaborador(int idColaborador, String nome, String cpf, String senha) {
		this.idColaborador = idColaborador;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public int getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	
}
