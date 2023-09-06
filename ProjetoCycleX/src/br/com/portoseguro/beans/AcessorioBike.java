package br.com.portoseguro.beans;

public class AcessorioBike{
    
	private String nome;
	private String marca;
    private double preco;

 // ============= CONSTRUTORES ==================
    public AcessorioBike() {
		super();
	}

	public AcessorioBike(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

// ============= GETTERS & SETTERS ==================
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


}
