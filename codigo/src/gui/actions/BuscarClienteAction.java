package gui.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import dao.SalaoDAO;
import gui.BuscarClientePanel;
import pojo.Cliente;

public class BuscarClienteAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	private BuscarClientePanel panel;

	/**
	 * 
	 * @param panel
	 */
	public BuscarClienteAction(BuscarClientePanel panel) {
		super("Buscar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		SalaoDAO dao = new SalaoDAO();
		Cliente c = null;

		if (panel.getTelefone() != null && panel.getNome() != null) {
			JOptionPane.showMessageDialog(null, "Digite apenas um campo");
		} else if (panel.getTelefone() != null) {
			try {
				c = dao.findClienteByTelefone(panel.getTelefone());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (panel.getNome() != null) {
			try {
				c = dao.findClienteByNome(panel.getNome());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(null, c.toString());
	}
}