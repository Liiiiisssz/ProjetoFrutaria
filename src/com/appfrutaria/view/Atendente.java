package com.appfrutaria.view;

import java.util.Scanner;
import com.appfrutaria.model.*;

public class Atendente {

	Scanner leia;
	String nome;
	double preco;
	int quantidade;
	int indice;
	
	public Atendente() {
		leia = new Scanner(System.in);
	}
	
	public int menuPrincipal() {
		System.out.println(" ");
		System.out.println("--     Frutaria    --");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Remover produto");
		System.out.println("4 - Editar produto");
		System.out.println("---------------------");
		System.out.println("0 - Sair");
		System.out.println("---------------------");
		
		int opcaoMenu = leia.nextInt();
		leia.nextLine();
		return opcaoMenu;
	}

	public int escolhaProduto() {
		System.out.println("");
		System.out.println("-- Cadastrar --");
		System.out.println("1 - Fruta");
		System.out.println("2 - Verdura");
		System.out.print("> ");
		int escolha = leia.nextInt();
		leia.nextLine();
		System.out.println("");
		return escolha;
	}
	
	public String definirNome() {
		System.out.print("Nome: ");
		nome = leia.nextLine();
		return nome;
	}
	
	public double definirPreco() {
		System.out.print("Preço: ");
		preco = leia.nextDouble();
		leia.nextLine();
		return preco;
	}
	
	public int definirQuantidade() {
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		leia.nextLine();
		return quantidade;
	}
	
	public double definirPeso() {
		System.out.print("Peso: ");
		double peso = leia.nextDouble();
		leia.nextLine();
		return peso;
	}
	
	public String definirTipo() {
		System.out.print("Tipo: ");
		String tipo = leia.nextLine();
		return tipo;
	}
	
	public void listaVazia() {
		System.out.println("");
		System.out.println("Estoque vazio!");
		System.out.println("");
	}
	
	public void cabecalho() {
		System.out.println("");
		System.out.println("-- Produtos Cadastrados --");
	}
	
	public void frutas() {
		System.out.println("");
		System.out.println("-- Frutas Cadastradas --");
		System.out.println("");
	}
	
	public void verduras() {
		System.out.println("");
		System.out.println("-- Verduras Cadastradas --");
		System.out.println("");
	}
	
	public void listarProduto(Produto produto) {
		System.out.println(produto);
		System.out.println("");
	}
	
	public String remover() {
		System.out.println("");
		System.out.println("Insira o nome do produto para remoção: ");
		System.out.println("");
		String nome = leia.nextLine();
		return nome;
	}
	
	public void removido() {
		System.out.println("");
		System.out.println("Produto removido com sucesso.");
		System.out.println("");
	}
	
	public void naoEncontrado() {
		System.out.println("");
		System.out.println("Produto não encontrado.");
		System.out.println("");
	}
	
	public String pesquisar() {
		System.out.println("");
		System.out.print("Nome do produto para edição: ");
		String nome = leia.nextLine();
		System.out.println("");
		return nome;
	}
	
	public void editando(Produto produto) {
		System.out.println("");
		System.out.println("O produto a ser editado é:");
		System.out.println("");
		listarProduto(produto);
		System.out.println("");
		System.out.println("Insira os novos dados: ");
		System.out.println("");
	}
	
	public void editado() {
		System.out.println("");
		System.out.println("Produto editado com sucesso.");
		System.out.println("");
	}
	
	public void opcaoInvalida() {
		System.out.println("Opção inválida! Por favor, selecione novamente.");
		System.out.println("");
	}
	
	public void encerrar() {
		System.out.println("");
		System.out.println("Sistema encerrado.");
	}
	
	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
}
