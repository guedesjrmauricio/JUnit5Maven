package CarrinhoCompras.JUnit5Maven;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras 
{
	private List<Produto> produtos;
	
	public CarrinhoCompras() 
	{
		super();
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adicionarProduto( Produto produto )
	{
		getProdutos().add( produto );
	}
	
	public int obterNumeroProdutos()
	{
		return getProdutos().size();
	}
	
	public Produto obterProdutoPosicao( int posicao )
	{
		return getProdutos().get( posicao );
	}
	
	public void removerProdutoPosicao( int posicao )
	{
		getProdutos().remove( posicao );
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
