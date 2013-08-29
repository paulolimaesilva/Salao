package POJO;

public class Profissional {

	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private String CPF;

	public Profissional(String nome, String telefone, String endereco,
			String email, String CPF) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.CPF = CPF;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "Profissional [nome=" + nome + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", email=" + email + ", CPF="
				+ CPF + "]";
	}

}
