package dao;

import java.util.List;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import pojo.Atendimento;
import pojo.Cliente;
import pojo.Produto;
import pojo.Profissional;
import pojo.Agenda;

public class SalaoDAO {

	Connection db = null;
	PreparedStatement st = null;
	private Statement statement;

	public void conecta() throws Exception {
		Class.forName("org.sqlite.JDBC");
		db = DriverManager.getConnection("jdbc:sqlite:db_salao.db");
		statement = db.createStatement();
		db.setAutoCommit(false);
		db.setAutoCommit(true);
	}

	public void desconecta() {
		try {
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertCliente(Cliente cliente) throws Exception {
		conecta();

		String cmd = "INSERT INTO cliente (`nome`, `telefone`, `email`, `endereco`) VALUES (?, ?, ?, ?)";

		try {
			st = db.prepareStatement(cmd);
			st.setString(1, cliente.getNome());
			st.setString(2, cliente.getTelefone());
			st.setString(3, cliente.getEmail());
			st.setString(4, cliente.getEndereco());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir Cliente!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
	}

	public Cliente findClienteByNome(String nome) throws Exception {
		conecta();
		Cliente cliente = null;
		String cmd = "SELECT * FROM cliente WHERE nome LIKE ?";

		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setString(1, nome);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				String nomeBD = rs.getString("nome");
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				cliente = new Cliente(nomeBD, telefone, email, endereco);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return cliente;
	}

	public Cliente findClienteByTelefone(String telefone) throws Exception {
		conecta();
		Cliente cliente = null;
		String cmd = "SELECT * FROM cliente WHERE telefone LIKE ?";

		ResultSet rs = null;

		try {

			st = db.prepareStatement(cmd);
			st.setString(3, telefone);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				String nome = rs.getString(2);
				String telefoneBD = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				cliente = new Cliente(nome, telefoneBD, email, endereco);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return cliente;
	}

	public Cliente findClienteByCodigo(int codigo) throws Exception {
		conecta();
		Cliente cliente = null;
		String cmd = "SELECT * FROM cliente WHERE codigo LIKE ?";

		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setInt(1, codigo);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				int codigoBD = rs.getInt(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				cliente = new Cliente(codigoBD, nome, telefone, email, endereco);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return cliente;
	}

	public void insertProfissional(Profissional prof) throws Exception {
		conecta();
		String cmd = "INSERT INTO `profissional` (`nome`, `Telefone`, `endereco`, `email`, `CPF`) VALUES (?,?,?,?,?)";

		try {

			st = db.prepareStatement(cmd);
			st.setString(1, prof.getNome());
			st.setString(2, prof.getTelefone());
			st.setString(3, prof.getEndereco());
			st.setString(4, prof.getEmail());
			st.setString(5, prof.getCPF());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir Profissional!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
	}

	public Profissional findProfissionalByNome(String nome) throws Exception {
		conecta();
		Profissional prof = null;
		String cmd = "SELECT * FROM profissional WHERE nome LIKE ?";

		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setString(1, nome);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				String nomeBD = rs.getString("nome");
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				String CPF = rs.getString(6);
				prof = new Profissional(nomeBD, telefone, endereco, email, CPF);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return prof;
	}

	public Profissional findProfissionalByCPF(String CPF) throws Exception {
		conecta();
		Profissional prof = null;
		String cmd = "select * from profissional where cpf like ?";
		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setString(1, CPF);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				String CPFBD = rs.getString("cpf");
				prof = new Profissional(nome, telefone, endereco, email, CPFBD);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return prof;
	}

	public Profissional findProfissionalByCodigo(int codigo) throws Exception {
		conecta();
		Profissional prof = null;
		String cmd = "select * from profissional where codigo like ?";
		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setInt(1, codigo);
			rs = st.executeQuery();

			while (rs.next()) {
				int codigoBD = rs.getInt("codigo");
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				String CPF = rs.getString(6);
				prof = new Profissional(codigoBD, nome, telefone, endereco,
						email, CPF);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return prof;
	}

	public void insertProduto(Produto produto)throws Exception  {
		conecta();
		String cmd = "INSERT INTO `produto` (`codigoDeBarras`, `nome`, `valorDeCusto`, `valorDeVenda`, `estoque`, `estoqueminimo`) VALUES (?,?,?,?,?,?)";

		try {
			st = db.prepareStatement(cmd);
			st.setInt(1, produto.getCodigoDeBarras());
			st.setString(2, produto.getNome());
			st.setDouble(3, produto.getValorDeCusto());
			st.setDouble(4, produto.getValorDeVenda());
			st.setInt(5, produto.getEstoque());
			st.setInt(6, produto.getEstoqueMinimo());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir Produto!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
	}

	public Produto findProdutoByCodigoDeBarras(int codigoDeBarras) throws Exception {
		conecta();
		Produto produto = null;
		String cmd = "select * from produto where codigoDeBarras like ?";
		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setInt(1, codigoDeBarras);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				int codigoDeBarrasBD = rs.getInt("codigoDeBarras");
				String nome = rs.getString(3);
				double valorDeCusto = rs.getDouble(4);
				double valorDeVenda = rs.getDouble(5);
				int estoque = rs.getInt(6);
				int estoqueMinimo = rs.getInt(7);
				produto = new Produto(codigoDeBarrasBD, nome, valorDeCusto,
						valorDeVenda, estoque, estoqueMinimo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return produto;
	}

	public Produto findProdutoByNome(String nome)throws Exception  {
		conecta();
		Produto produto = null;
		String cmd = "select * from produto where nome like ?";
		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setString(1, nome);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				int codigoDeBarras = rs.getInt(1);
				String nomeBD = rs.getString("nome");
				double valorDeCusto = rs.getDouble(4);
				double valorDeVenda = rs.getDouble(5);
				int estoque = rs.getInt(6);
				int estoqueMinimo = rs.getInt(7);
				produto = new Produto(codigoDeBarras, nomeBD, valorDeCusto,
						valorDeVenda, estoque, estoqueMinimo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return produto;
	}

	public void insertAtendimento(Atendimento atend)throws Exception  {
		conecta();
		String cmd = "INSERT INTO `atendimento` (`codCliente`, `codProfissional`, `codVendaProdutos`, `valorFinal`, `data`) VALUES (?,?,?,,?,now())";

		try {
			st = db.prepareStatement(cmd);
			st.setInt(1, atend.getCodCliente());
			st.setInt(2, atend.getCodProfissional());
			st.setInt(3, atend.getCodVendaProdutos());
			st.setDouble(4, atend.getValorFinal());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir Produto!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
	}

	public List<Agenda> findAgendaDiaria(Profissional p)throws Exception  {
		conecta();
		String cmd = "select * from agenda where profissional= ?";
		List<Agenda> agenda = new ArrayList<Agenda>();

		ResultSet rs = null;

		try {
			st = db.prepareStatement(cmd);
			st.setInt(1, 1);
			rs = st.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				int codProf = rs.getInt(2);
				int codCliente = rs.getInt(3);
				Date data = rs.getDate(4);
				String hora = rs.getString(5);

				Profissional profi = findProfissionalByCodigo(codProf);
				Cliente cliente = findClienteByCodigo(codCliente);

				agenda.add(new Agenda(id, profi, cliente, data, hora));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		desconecta();
		return agenda;
	}

}
