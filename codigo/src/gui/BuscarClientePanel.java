package gui;

import javax.swing.JPanel;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BuscarClientePanel extends JPanel {
	private JTextField textNome;
	private JTextField textTelefone;

	/**
	 * Create the panel.
	 */
	public BuscarClientePanel() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblBuscarClientePor = new JLabel("Buscar Cliente por:");
		lblBuscarClientePor.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscarClientePor.setVerticalAlignment(SwingConstants.CENTER);
		lblBuscarClientePor.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		add(lblBuscarClientePor, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel.add(verticalStrut, "34, 2, 1, 5");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		panel.add(lblNome, "8, 4, right, default");
		
		textNome = new JTextField();
		panel.add(textNome, "10, 4, 14, 1, fill, default");
		textNome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		panel.add(lblTelefone, "8, 6, right, default");
		
		textTelefone = new JTextField();
		textTelefone.setText("");
		panel.add(textTelefone, "10, 6, 14, 1, fill, default");
		textTelefone.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		panel.add(btnBuscar, "10, 8");
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		panel.add(btnCancelar, "14, 8");
	}
	
	public String getNome() {
		return textNome.getText();
		
	}
	
	public String getTelefone() {
		return textTelefone.getText();
	}
}
