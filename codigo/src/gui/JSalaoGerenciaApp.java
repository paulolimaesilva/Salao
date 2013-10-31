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
import gui.JAgendaDiariaPanel;
import java.awt.Color;

public class JSalaoGerenciaApp {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private CardLayout card;
	private CadastrarClientePanel cdClientePanel = new CadastrarClientePanel();
	private BuscarClientePanel fdClientePanel = new BuscarClientePanel();
//	private JAgendaDiariaPanel agendaDiaria = new JAgendaDiariaPanel();

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
		frame.setBounds(100, 100, 600, 600);
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
		frame.getContentPane().add(panel_2, "name_Panel2");

		panel_2.add(fdClientePanel);
		
		JPanel panel_3 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_3, "name_Panel3");

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

		JMenu mnAgenda = new JMenu("Agenda");
		menuBar.add(mnAgenda);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mntmNewMenuItem_3.setAction(action_3);
		mnAgenda.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_2.setAction(action_2);
		mnAgenda.add(mntmNewMenuItem_2);
	}

	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Ver Agenda");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			card.show(frame.getContentPane(), "name_6126640247321");
		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Reservar horário");
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