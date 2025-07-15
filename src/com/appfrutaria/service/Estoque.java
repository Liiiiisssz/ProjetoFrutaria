package com.appfrutaria.service;

import com.appfrutaria.model.*;
import com.appfrutaria.view.Atendente;

import java.util.List;
import java.util.ArrayList;

public class Estoque {
	
	List<Produto> estoqueProduto;
	
	public Estoque() {
		estoqueProduto = new ArrayList<>();
	}
	
	public boolean gerenciarEstoque(int opcaoMenuEscolhida, Atendente atendente) {
		
		boolean escolha;
		if(opcaoMenuEscolhida < 0 || opcaoMenuEscolhida > 4) {
			atendente.opcaoInvalida();
			escolha = true;
			
		} else {
			escolha = true;
			switch(opcaoMenuEscolhida) {
			case 1 ->{
				int produto = atendente.escolhaProduto();
				
				String nome = atendente.definirNome();
				double preco = atendente.definirPreco();
				int quantidade = atendente.definirQuantidade();
				
				switch(produto) {
				case 1->{
					double peso = atendente.definirPeso();
					Produto fruta = new Fruta(nome, preco, quantidade, peso);
					estoqueProduto.add(fruta);
				}
				case 2->{
					String tipo = atendente.definirTipo();
					Produto verdura = new Verdura(nome, preco, quantidade, tipo);
					estoqueProduto.add(verdura);
				}
				}
			}
			case 2 ->{
				atendente.cabecalho();
				
				if(estoqueProduto.isEmpty()) {
					atendente.listaVazia();
				}
				for(Produto produto : estoqueProduto) {
					if(produto instanceof Fruta) {
						atendente.frutas();
						for (Produto produt : estoqueProduto) {
							if(produt instanceof Fruta fruta) {
								atendente.listarProduto(fruta);
							} 
						}
					}
				}
				for(Produto produto : estoqueProduto) {
					if(produto instanceof Verdura) {
						atendente.verduras();
						for (Produto produt : estoqueProduto) {
							if(produt instanceof Verdura verdura) {
								atendente.listarProduto(verdura);
							}
						}
					}
				}
			}	
			case 3 ->{
				String nome = atendente.remover();
				boolean removido = false;
				
				for(int indice = 0; indice < estoqueProduto.size(); indice++) {
					if(estoqueProduto.get(indice).getNome().equalsIgnoreCase(nome)) {
						estoqueProduto.remove(indice);
						removido = true;
						break;
					}
				}
				if(removido) {
					atendente.removido();
				} else {
					atendente.naoEncontrado();
				}
			}
			case 4->{
				String nome = atendente.pesquisar();
				boolean encontrado = false;
				
				for(Produto produto : estoqueProduto) {
					if(produto.getNome().equalsIgnoreCase(nome)) {
						atendente.editando(produto);
						produto.setNome(atendente.definirNome());
						produto.setPreco(atendente.definirPreco());
						produto.setQuantidade(atendente.definirQuantidade());
						
						if(produto instanceof Fruta) {
							((Fruta) produto).setPeso(atendente.definirPeso());
						} else if(produto instanceof Verdura) {
							((Verdura) produto).setTipo(atendente.definirTipo());
						}
						
						encontrado = true;
						break;
					}
				}
				if(encontrado) {
					atendente.editado();
				} else {
					atendente.naoEncontrado();
				}
			}
			case 0 ->{
				atendente.encerrar();
				escolha = false;
			}
		}
		}
		return escolha;
	}
	
	public List<Produto> getEstoqueProduto(){
		return estoqueProduto;
	}
	
	public void setEstoqueFrua(List<Produto> estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}
}
