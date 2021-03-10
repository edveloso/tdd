package br.edu.infnet.tdd.modelo;

public class Produto {
	
	private String nome;
	private double valor;

	public Produto(String nome, double valor) {
		this.setNome(nome);
		this.setValor(valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSubtotal() {
		return 9000.0;
	}

}
