package dao;

import java.util.List;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import pojo.Atendimento;
import pojo.Cliente;
import pojo.Produto;
import pojo.Profissional;
import pojo.Agenda; 


public class SalaoDAO {

	public void insertCliente(Cliente cliente) {
		String cmd = "INSERT INTO cliente (`nome`, `telefone`, `email`, `endereco`) VALUES (?, ?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
	}

	public Cliente findClienteByNome(String nome) {
		Cliente cliente = null;
		String cmd = "SELECT * FROM cliente WHERE nome LIKE ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

			st = db.prepareStatement(cmd);
			st.setString(1, nome);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				String nomeBD = rs.getString("nome");
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				cliente = new Cliente(nomeBD, telefone, email,
						endereco);
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
		return cliente;
	}
	
	public Cliente findClienteByTelefone(String telefone) {
		Cliente cliente = null;
		String cmd = "SELECT * FROM cliente WHERE telefone LIKE ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

			st = db.prepareStatement(cmd);
			st.setString(3, telefone);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				String nome = rs.getString(2);
				String telefoneBD = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				cliente = new Cliente(nome, telefoneBD, email,
						endereco);
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
		return cliente;
	}

	public Cliente findClienteByCodigo(int codigo) {
		Cliente cliente = null;
		String cmd = "SELECT * FROM cliente WHERE codigo LIKE ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
				cliente = new Cliente(codigoBD, nome, telefone, email,
						endereco);
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
		return cliente;
	}
	
	public void insertProfissional(Profissional prof) {
		String cmd = "INSERT INTO `profissional` (`nome`, `Telefone`, `endereco`, `email`, `CPF`) VALUES (?,?,?,?,?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
	}

	public Profissional findProfissionalByNome(String nome) {
		Profissional prof = null;
		String cmd = "SELECT * FROM profissional WHERE nome LIKE ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
		return prof;
	}

	public Profissional findProfissionalByCPF(String CPF) {
		Profissional prof = null;
		String cmd = "select * from profissional where cpf like ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
		return prof;
	}
	
	public Profissional findProfissionalByCodigo(int codigo) {
		Profissional prof = null;
		String cmd = "select * from profissional where codigo like ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
				prof = new Profissional(codigoBD, nome, telefone, endereco, email, CPF);
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
		return prof;
	}

	public void insertProduto(Produto produto) {
		String cmd = "INSERT INTO `produto` (`codigoDeBarras`, `nome`, `valorDeCusto`, `valorDeVenda`, `estoque`, `estoqueminimo`) VALUES (?,?,?,?,?,?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
	}

	public Produto findProdutoByCodigoDeBarras(int codigoDeBarras) {
		Produto produto = null;
		String cmd = "select * from produto where codigoDeBarras like ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
		return produto;
	}

	public Produto findProdutoByNome(String nome) {
		Produto produto = null;
		String cmd = "select * from produto where nome like ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
		return produto;
	}

	public void insertAtendimento(Atendimento atend) {
		String cmd = "INSERT INTO `atendimento` (`codCliente`, `codProfissional`, `codVendaProdutos`, `data`, `valorFinal`) VALUES (?,?,?,now(),?)";
		Connection db = null;
		PreparedStatement st = null;

		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("salao.properties"));
			String url = prop.getProperty("url");

			db = DriverManager.getConnection(url, prop);

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
	}
	
	public List <Agenda> findAgendaDiaria(Profissional p){
		String cmd = "select * from agenda where profissional= ?";
        List<Agenda> agenda = new ArrayList<Agenda>();
        
        Connection db = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
                Properties props = new Properties();
                props.load(new FileInputStream("salao.properties"));
                String url = props.getProperty("url");

                db = DriverManager.getConnection(url, props);

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
        return agenda;
	}
	
	
}

