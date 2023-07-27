package model;

public class Cliente {
	
	private String nome;
	private String email;
	private int idCliente;
	
	public Cliente (String nome, String email, int idCliente) {
		this.nome = nome;
		this.email = email;
		this.idCliente = idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
