package gui.actions;


import gui.CadastrarClientePanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CadastrarClienteLimparAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	private CadastrarClientePanel panel;

	public CadastrarClienteLimparAction(CadastrarClientePanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
	}
}