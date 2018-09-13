package CarrinhoCompras.JUnit5Maven;

public class Produto 
{
	private int id;
	
	private String descricao;
	
	public Produto() 
	{
		super();
	}
	
	public Produto( int id, String descricao ) 
	{
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.id + " Descri��o: " + this.descricao + " - Atributos da classe.";
	}

}
