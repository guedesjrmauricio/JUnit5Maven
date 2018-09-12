package CarrinhoCompras.JUnit5Maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarrinhoComprasTest {
	
	private CarrinhoCompras carrinho;

	@Test
	void testAdicionarProduto() 
	{
		Produto produto = new Produto( 1, "Produto 1" );
		adicionarProduto( produto );
		assertTrue(true);
	}

	@Test
	void testObterNumeroProdutos() 
	{
		Produto produto = new Produto( 2, "Produto 2" );
		adicionarProduto( produto );
		assertEquals( 1, carrinho.obterNumeroProdutos() );
		System.out.println( "Número de produto adicionado: " + carrinho.obterNumeroProdutos() ); 
	}

	@Test
	void testObterProdutoPosicao() {
		int posicao = 0;
		Produto produto = new Produto( 3, "Produto 3" );
		adicionarProduto( produto );
		try
		{
			Produto produtoObtido = this.carrinho.obterProdutoPosicao( posicao );
			System.out.println( "Produto obtido na posição 0: " + produtoObtido.toString() );		
		}
		catch( Exception e )
		{
			String message = "Erro ao obter produto na posição: " + posicao + "; " + e.getMessage();
			System.out.println( message );
			fail( message );
		}
	}

	@Test
	void testRemoverProdutoPosicao() {
		int posicao = 0;
		Produto produto = new Produto( 4, "Produto 4" );
		adicionarProduto( produto );
		try
		{
			removerProdutoNaPosicao( posicao );
		}
		catch( Exception e )
		{
			String message = "Erro ao remover produto na posição: " + posicao + "; " + e.getMessage();
			System.out.println( message );
			fail( message );
		}
	}

	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
	
	@BeforeEach
	void beforeEach()
	{
		System.out.println("Before each test methods");
		carrinho=new CarrinhoCompras();
	}	 
	
	private void adicionarProduto( Produto produto )
	{
		this.carrinho.adicionarProduto(produto);
		System.out.println( "Produto adicionado. " + produto.toString() );
	}
	
	private void removerProdutoNaPosicao( int posicao )
	{
		this.carrinho.removerProdutoPosicao( posicao );
		System.out.println( "Produto Removido da posição " + posicao );
	}
}
