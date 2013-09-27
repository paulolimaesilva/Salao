package pojo;

public class Atendimento {
	private int codCliente;
	private int codProfissional;
	private int codVendaProdutos;
	private double valorFinal;
	
	public Atendimento(int codCliente, int codProfissional,
			int codVendaProdutos, double valorFinal) {
		super();
		this.codCliente = codCliente;
		this.codProfissional = codProfissional;
		this.codVendaProdutos = codVendaProdutos;
		this.valorFinal = valorFinal;
	}

	
	public int getCodCliente() {
		return codCliente;
	}

	
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	
	public int getCodProfissional() {
		return codProfissional;
	}

	
	public void setCodProfissional(int codProfissional) {
		this.codProfissional = codProfissional;
	}

	
	public int getCodVendaProdutos() {
		return codVendaProdutos;
	}

	
	public void setCodVendaProdutos(int codVendaProdutos) {
		this.codVendaProdutos = codVendaProdutos;
	}

	
	public double getValorFinal() {
		return valorFinal;
	}

	
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}


	
	@Override
	public String toString() {
		return "Atendimento [codCliente=" + codCliente + ", codProfissional="
				+ codProfissional + ", codVendaProdutos=" + codVendaProdutos
				+ ", valorFinal=" + valorFinal + "]";
	}
	
	
	

}
