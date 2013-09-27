package Test;

import java.awt.EventQueue;

import gui.CadastrarClientePanel;

public class TesteGui {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarClientePanel window = new CadastrarClientePanel();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
