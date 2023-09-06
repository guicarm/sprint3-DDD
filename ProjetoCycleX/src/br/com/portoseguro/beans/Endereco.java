package br.com.portoseguro.beans;

public class Endereco {
	 					
	private String logradouro;
	private int numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String estado;
	private String nacionalidade;
	
//=================== CONSTRUTORES =========================
	public Endereco() {
		super();
	}
	public Endereco(String logradouro, int numero, String cep, String bairro, String municipio, String estado,
			String nacionalidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.nacionalidade = nacionalidade;
	}
	
//=================== SETTERS & GETTERS =========================
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
