package br.com.portoseguro.beans;

public class Bike {

	private double precoBike;
	private String marca;
	private int ano;
	private String tipo;

//=================== CONSTRUTORES =========================
	public Bike() {
		super();
	}

	public Bike(double precoBike, String marca, int ano, String tipo) {
		super();
		this.precoBike = precoBike;
		this.marca = marca;
		this.ano = ano;
		this.tipo = tipo;
	}

//=================== SETTERS & GETTERS =========================
	public double getPrecoBike() {
		return precoBike;
	}

	public void setPrecoBike(double precoBike) {
		this.precoBike = precoBike;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
