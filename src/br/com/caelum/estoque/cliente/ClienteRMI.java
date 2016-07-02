package br.com.caelum.estoque.cliente;

import java.rmi.Naming;

import br.com.caelum.estoque.rmi.EstoqueRmi;
import br.com.caelum.estoque.rmi.ItemEstoque;

public class ClienteRMI {
	
	public static void main(String[] args) throws Exception {
		
		EstoqueRmi estoque = (EstoqueRmi) Naming
				.lookup("rmi://localhost:1099/estoque");

		ItemEstoque item = estoque.getiItemEstoque("WEB");
		
		System.out.println("Quantidade disponível: " + item.getQuantidade());
		
	}

}
