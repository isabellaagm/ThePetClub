package model;


public class Servico {

	private int idServico;
	private int idAnimal;
	private String data;
	private String servico;
	
	public Servico(int idServico, int idAnimal, String data, String servico) {
		this.idServico = idServico;
		this.idAnimal = idAnimal;
		this.data = data;
		this.servico = servico;
	}
	
	public Servico() {
		
	}
	
	public int getIdServico() {
		return idServico;
	}
	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	
	
}
