import java.sql.*;

import javax.swing.JOptionPane;

public class Connect {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			String userName = "prlimaesilva";
			String password = "prls091090";
			String url = "jdbc:mysql://localhost/salao";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			JOptionPane.showMessageDialog(null,
					"Conex�o com o BD estabelecida!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"N�o foi poss�vel estabelecer conex�o com o BD");
		} finally {
			if (conn != null) {
				try {
					conn.close();
					JOptionPane.showMessageDialog(null, "Conex�o finalizada");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Houve erro ao fechar a conex�o com o banco.");
				}
			}
		}
	}
}