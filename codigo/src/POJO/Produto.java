package pojo;

public class Produto {
	private int codigoDeBarras;
	private String nome;
	private double valorDeCusto;
	private double valorDeVenda;
	private int estoque;
	private int estoqueMinimo;

	public Produto(int codigoDeBarras, String nome, double valorDeCusto,
			double valorDeVenda, int estoque, int estoqueMinimo) {
		super();
		this.codigoDeBarras = codigoDeBarras;
		this.nome = nome;
		this.valorDeCusto = valorDeCusto;
		this.valorDeVenda = valorDeVenda;
		this.estoque = estoque;
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getCodigoDeBarras() {
		return codigoDeBarras;
	}

	
	public void setCodigoDeBarras(int codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorDeCusto() {
		return valorDeCusto;
	}

	public void setValorDeCusto(double valorDeCusto) {
		this.valorDeCusto = valorDeCusto;
	}

	public double getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}


	@Override
	public String toString() {
		return "Produto [codigoDeBarras=" + codigoDeBarras + ", nome=" + nome
				+ ", valorDeCusto=" + valorDeCusto + ", valorDeVenda="
				+ valorDeVenda + ", estoque=" + estoque + ", estoqueMinimo="
				+ estoqueMinimo + "]";
	}

}
