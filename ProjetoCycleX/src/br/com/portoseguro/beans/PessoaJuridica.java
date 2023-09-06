package br.com.portoseguro.beans;

public class PessoaJuridica extends Pessoa {

	private String razaoSocial;
	private String cnpj;

//=================== CONSTRUTORES =========================
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// CONSTRUTOR COM HERANÇA
	public PessoaJuridica(String nome, String email, String telefone, int idade, double renda, String razaoSocial,
			String cnpj) {
		super(nome, email, telefone, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

//=================== SETTERS & GETTERS =========================
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

// ================ MÉTODO PARA A IDENTIFICAÇÃO DO CADASTRO ===================

	public String identificacao() {
		return "PESSOA JURÍDICA (PJ)";
	}
}
