package gui.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import dao.SalaoDAO;
import gui.CadastrarClientePanel;
import pojo.Cliente;

public class CadastrarClienteAction extends AbstractAction {


	private static final long serialVersionUID = 1L;


	private CadastrarClientePanel panel;

	public CadastrarClienteAction(CadastrarClientePanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente c = panel.getCliente();
		//System.out.println(c);
		SalaoDAO dao = new SalaoDAO();
		try {
			dao.insertCliente(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}