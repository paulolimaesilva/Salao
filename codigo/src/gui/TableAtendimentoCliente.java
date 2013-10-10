package gui;

import javax.swing.table.AbstractTableModel;

import pojo.Cliente;

public class TableAtendimentoCliente extends AbstractTableModel {

	/**
	 * Create the panel.
	 */
	public TableAtendimentoCliente(Cliente c) {

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return "teste";
	}

}
