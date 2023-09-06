package br.com.portoseguro.beans;

public class Pessoa {

	private String nome;
	private String email;
	private String telefone;
	private int idade;
	private double renda;
	private Endereco endereco;
	
//=================== CONSTRUTORES =========================
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String email, String telefone, int idade, double renda, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
		this.renda = renda;
		this.endereco = endereco;
	}
	

	public Pessoa(String nome, String email, String telefone, int idade, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
		this.renda = renda;
	}

//=================== SETTERS & GETTERS =========================
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
