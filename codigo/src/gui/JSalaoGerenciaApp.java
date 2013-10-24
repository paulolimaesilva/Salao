package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import gui.CadastrarClientePanel;
import gui.BuscarClientePanel;
import java.awt.Color;

public class JSalaoGerenciaApp {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private CardLayout card;
	private CadastrarClientePanel cdClientePanel = new CadastrarClientePanel();
	private BuscarClientePanel fdClientePanel = new BuscarClientePanel();


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSalaoGerenciaApp window = new JSalaoGerenciaApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JSalaoGerenciaApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
                JSalaoGerenciaApp.class
                                .getResource("/globo.gif")));frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		card = new CardLayout(0, 0);
		frame.getContentPane().setLayout(card);

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, "name_6126640247321");


		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1, "name_6126640247321");

		panel_1.add(cdClientePanel);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_2, "name_6128366176959");

		panel_2.add(fdClientePanel);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mntmNewMenuItem_1.setAction(action);
		mnCliente.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setAction(action_1);
		mnCliente.add(mntmNewMenuItem);
		
		JMenu mnProfissional = new JMenu("Profissional");
		menuBar.add(mnProfissional);

		JMenuItem mntmProfissionalItem_1 = new JMenuItem("New menu item");
		mntmNewMenuItem_1.setAction(action_2);
		mnCliente.add(mntmNewMenuItem_1);

		JMenuItem mntmProfissionalItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setAction(action_3);
		mnCliente.add(mntmNewMenuItem);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Cadastrar novo cliente");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			card.show(frame.getContentPane(), "name_6126640247321");
		}
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Cadastrar novo cliente");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			card.show(frame.getContentPane(), "name_6126640247321");
		}
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Cadastrar novo cliente");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			card.show(frame.getContentPane(), "name_6126640247321");
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Buscar Cliente");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			card.show(frame.getContentPane(), "name_6128366176959");			
		}
	}
}