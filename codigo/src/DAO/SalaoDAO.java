package DAO;

import com.mysql.jdbc.*;

import POJO.Cliente;
import POJO.Profissional;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SalaoDAO {
	
	private Connection con;  
	private Statement comando;  
		
	public Cliente findClienteByNome(String nome){
		Cliente cliente = null;
		String cmd = "select * from cliente where nome= ?";
		
		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("Salao.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, nome);
			rs = st.executeQuery();

			while (rs.next()) {
				
				int contaId = rs.getInt(1);
				String nomeBD = rs.getString("nome");
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				String endereco = rs.getString(5);
				cliente = new Cliente(contaId, nomeBD, telefone, email, endereco);
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
	
	public Cliente findClienteByCodigo(int codigo){
		//TODO fazer o método de consulta por codigo
	return null;
	}
	
	public Profissional findProfissionalByNome(String nome){
		//TODO fazer o método de consulta por nome
	return null;
	}
	
	public Profissional findProfissionalByCPF(String CPF){
		//TODO fazer o método de consulta por CPF
	return null;
	}
	
	public Profissional findProfissionalByCodigo(String codigo){
		//TODO fazer o método de consulta por Codigo
	return null;
	}

}
