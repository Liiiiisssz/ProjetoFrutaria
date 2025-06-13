package com.appfrutaria.model;

public class Fruta {
	/*
	 * Classe objeto, onde os atributos para a fruta armazenada no sistema 
	 * são criados
	 */
	
	private String nome;
	private String tipo;
	private double preco;
	private int quantidade;
	
	public Fruta() {
		this.nome = "";
		this.tipo = "";
		this.preco = 0.0;
		this.quantidade = 0;
	}
	
	public Fruta(String nome, String tipo, double preco, int quantidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
