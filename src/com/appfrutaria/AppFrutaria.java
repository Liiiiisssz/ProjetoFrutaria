package com.appfrutaria;

import com.appfrutaria.view.Atendente;
import com.appfrutaria.service.Estoque;

public class AppFrutaria {

	public static void main(String[] args) {
	
		int opcaoMenuEscolhida;
		boolean escolha;
		
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		
		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			escolha = estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);
			
		} while(escolha);
	}
}
