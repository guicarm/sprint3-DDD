package br.com.portoseguro.beans;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String rg;

//=================== CONSTRUTORES =========================
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}

	// CONSTRUTOR COM HERANÇA
	public PessoaFisica(String nome, String email, String telefone, int idade, double renda, String cpf, String rg) {
		super(nome, email, telefone, idade, renda);
		this.cpf = cpf;
		this.rg = rg;
	}

//=================== SETTERS & GETTERS =========================
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
// ================ MÉTODO PARA A IDENTIFICAÇÃO DO CADASTRO ===================

	public String identificacao() {
		return "PESSOA FÍSICA (PF)";
	}
}
