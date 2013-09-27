package gui.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import dao.SalaoDAO;
import gui.CadastrarClientePanel;
import pojo.Cliente;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class CadastrarClienteAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private CadastrarClientePanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarClienteAction(CadastrarClientePanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente c = panel.getCliente();
		//System.out.println(c);
		SalaoDAO dao = new SalaoDAO();
		dao.insertCliente(c);
	}
}