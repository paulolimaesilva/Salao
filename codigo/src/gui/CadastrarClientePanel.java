package gui;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import pojo.Cliente;
import gui.actions.CadastrarClienteAction;
import gui.actions.CadastrarClienteLimparAction;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.UIManager;

public class CadastrarClientePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textEmail;
	private JTextField textEndereco;

	private JFrame frame;
	
	private CardLayout card;
	
	public JFrame getFrame() {
		return frame;
	}

	public CardLayout getCard() {
		return card;
	}
		
	public Cliente getCliente() {
		return new Cliente(textNome.getText(),textTelefone.getText(),textEmail.getText(),textEndereco.getText());
	}

	public void clear() {
		textNome.setText("");
		textTelefone.setText("");
		textEmail.setText("");
		textEndereco.setText("");
	}
	
	
	/**
	 * Create the panel.
	 */
	public CadastrarClientePanel() {
		
		setBackground(Color.WHITE);
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
//		setIconImage(getToolkit().createImage(getClass().getResource("/world.gif"))); 
		
		Component verticalStrut = Box.createVerticalStrut(20);
		add(verticalStrut, "8, 2, 1, 9");
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblNome, "4, 4, right, default");
		
		textNome = new JTextField();
		add(textNome, "6, 4, fill, default");
		textNome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblTelefone, "4, 6, right, default");
		
		textTelefone = new JTextField();
		add(textTelefone, "6, 6, fill, default");
		textTelefone.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblEmail, "4, 8, right, default");
		
		textEmail = new JTextField();
		add(textEmail, "6, 8, fill, default");
		textEmail.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		add(lblEndereo, "4, 10, right, default");
		
		textEndereco = new JTextField();
		add(textEndereco, "6, 10, fill, default");
		textEndereco.setColumns(10);
		
		JButton btnCadastrar = new JButton(new CadastrarClienteAction(this));
		btnCadastrar.setBackground(UIManager.getColor("Button.background"));
		btnCadastrar.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		btnCadastrar.setToolTipText("Cadastrar Cliente");
		btnCadastrar.setMnemonic(KeyEvent.VK_C);
		add(btnCadastrar, "6, 14");
		
		JButton btnLimpar = new JButton(new CadastrarClienteLimparAction(this));
		btnLimpar.setBackground(UIManager.getColor("Button.background"));
		btnLimpar.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		btnLimpar.setToolTipText("Cadastrar Cliente");
		btnLimpar.setMnemonic(KeyEvent.VK_C);
		add(btnLimpar, "6, 16");
		

	}
}
