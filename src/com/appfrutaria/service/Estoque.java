package com.appfrutaria.service;

import com.appfrutaria.model.Fruta;
import com.appfrutaria.view.Atendente;

import java.util.List;
import java.util.ArrayList;

public class Estoque {
	/*
	 * Classe estoque, para armazenar e gerenciar os objetos 
	 */
	
	List<Fruta> estoqueFruta;
	
	public Estoque() {
		estoqueFruta = new ArrayList<>();
	}
	
	public void gerenciarEstoque(int opcaoMenuEscolhida, Atendente atendente) {
		//método para gerenciar as escolhas do usuário
		switch(opcaoMenuEscolhida) {
		case 1 ->{ //cadastro
			System.out.println(" ");
			String nomeFruta = atendente.definirNome();
			String tipoFruta = atendente.definirTipo();
			double precoFruta = atendente.definirPreco();
			int quantidadeFruta = atendente.definirQuantidade();
			System.out.println(" ");
			
			Fruta fruta = new Fruta(nomeFruta, tipoFruta, precoFruta, quantidadeFruta);
			estoqueFruta.add(fruta);
			//criando um novo objeto e armazenando no ArrayList
		}
		case 2 ->{ //listagem
			int i = 0;
			for (Fruta fruta : estoqueFruta) {
				System.out.println(" ");
				System.out.println("[" + i + "]");
				atendente.listarFrutas(fruta);
				System.out.println("----------------------");
				i++;
			}
			i = 0;
		}	
		case 3 ->{ //remoção
			String nome = atendente.removerFruta();
			boolean removido = false;
			System.out.println(" ");
			
			for(int indice = 0; indice < estoqueFruta.size(); indice++) {
				
				if(estoqueFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
					estoqueFruta.remove(indice);
					removido = true;
					break;
					//buscando o indice de acordo com o nome inserido e removendo ele
				}
			}
			if(removido) {
				atendente.visualizarFrutaRemovida(nome);
				System.out.println(" ");
				
			} else {
				atendente.frutaNaoEncontrada();
			}
		}
		}
	}
	
	public List<Fruta> getEstoqueFruta(){
		return estoqueFruta;
	}
	
	public void setEstoqueFrua(List<Fruta> estoqueFruta) {
		this.estoqueFruta = estoqueFruta;
	}
}
