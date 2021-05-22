package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import br.com.impacta.models.*;
import org.junit.Test;

public class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveBuscarProdutoAsStaticMethod() {
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setDescricao("Camisa");
		produto.setValor(70.00);
		
		listaDeProdutos.add(produto);
		
		Produto produtoEncontrado = Produto.buscarProdutoPeloId(listaDeProdutos, 1);
		
		assertEquals("Camisa", produtoEncontrado.getDescricao());
		
	}

	@Test
	public void shouldBuscarProdutoWithNewProdutoCodigo15() {
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto produto = new Produto();
		produto.setCodigo(15);
		produto.setDescricao("Tenis");
		produto.setValor(200.0);
		
		listaDeProdutos.add(produto);
		
		Produto produtoEncontrado = Produto.buscarProdutoPeloId(listaDeProdutos, 15);
		
		assertEquals("Tenis", produtoEncontrado.getDescricao());
	}
	
}
