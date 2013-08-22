package POJO;

public class Cliente {

	private int codigo;
	private String nome;
	private String telefone;
	private String email;
	private String endereco;

	public Cliente(int codigo, String nome, String telefone, String email,
			String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", telefone="
				+ telefone + ", email=" + email + ", endereco=" + endereco
				+ "]";
	}
	
	

}
