package com.appfrutaria;

import com.appfrutaria.view.Atendente;
import com.appfrutaria.service.Estoque;

public class AppFrutaria {
	/*
	 * Classe main do código, serve para gerenciar os métodos principais
	 */

	public static void main(String[] args) {
	
		int opcaoMenuEscolhida;
		
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		
		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);
			
		} while(opcaoMenuEscolhida != 0 || opcaoMenuEscolhida < 0 || opcaoMenuEscolhida > 3);
		//do while para repetição da interação do usuário com o menu
		atendente.finalizarApp();
	}
}
/*
 * EXPLIQUE PORQUE ORGANIZAR O CÓDIGO EM PACOTES É IMPORTANTE
 * > Estruturar o código em packages é importante pois, além de manter o código mais organizado, 
 *  torna a manutenção, leitura e reutilização mais fácil.
 * 
 * EXPLIQUE PORQUE A UTILIZAÇÃO DO PRINCIPIO DA RESPONSABILIDADE UNICA NO CÓDIGO
 * > O principio da responsabilidade única foi utilizado para manter o código mais organizado,
 * separando as funções, com cada classe fazendo apenas uma coisa, assim tornando mais fácil 
 * encontrar e realizar a manutenção de certas partes do código
 */