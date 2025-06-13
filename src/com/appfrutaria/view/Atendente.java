package com.appfrutaria.view;

import java.util.Scanner;
import com.appfrutaria.model.Fruta;

public class Atendente {
	/*
	 * Classe para exibir textos e interações com o usuário
	 */

	Scanner leia;
	String nome;
	String tipo;
	double preco;
	int quantidade;
	int indice;
	
	public Atendente() {
		leia = new Scanner(System.in);
	}
	
	public int menuPrincipal() { //mostra o menu principal
		System.out.println(" ");
		System.out.println("--     Frutaria    --");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Remover produto");
		System.out.println("---------------------");
		System.out.println("0 - Sair");
		System.out.println("---------------------");
		
		int opcaoMenu = leia.nextInt();
		leia.nextLine();
		return opcaoMenu;
		//recebe resposta do usuário
	}

	public String definirNome() { //usuario define o nome da fruta
		System.out.print("Nome: ");
		nome = leia.nextLine();
		return nome;
	}
	
	public String definirTipo() { //usuario define o tipo da fruta
		System.out.print("Tipo: ");
		tipo = leia.nextLine();
		return tipo;
	}
	
	public double definirPreco() { //usuario define o preço da fruta
		System.out.print("Preço: ");
		preco = leia.nextDouble();
		leia.nextLine();
		return preco;
	}
	
	public int definirQuantidade() { //usuario define a quantidade de frutas
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		leia.nextLine();
		return quantidade;
	}
	
	public void listarFrutas(Fruta fruta) { //lista o nome, tipo, preço e quantidade de frutas
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Tipo: " + fruta.getTipo());
		System.out.println("Preço: " + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
	}
	
	public String removerFruta() { //usuário insere o nome para a fruta q deseja remover
		System.out.print("Digite o nome da fruta para exclusão: ");
		nome = leia.nextLine();
		return nome;
	}
	
	public void visualizarFrutaRemovida(String nome) { //confirmação que a fruta foi removida
		System.out.println("A fruta '" + nome + "' foi removida");
	}
	
	public void frutaNaoEncontrada() { //caso a fruta não seja encontrada
		System.out.println("Fruta não encontrada.");
	}
	
	public void finalizarApp() { //mensagem de finalização
		System.out.println("Sistema encerrado.");
	}
	
	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
}
