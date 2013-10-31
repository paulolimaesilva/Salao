package gui;

import gui.actions.AgendaFecharAction;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.Component;
import java.awt.event.KeyEvent;

import javax.swing.Box;

import pojo.Profissional;

public class JAgendaDiariaPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	JTable table;
	JFrame frame;

	private CardLayout card;

	public JFrame getFrame() {
		return frame;
	}

	public CardLayout getCard() {
		return card;
	}

	public JAgendaDiariaPanel(JFrame frame, CardLayout card) {
		setBackground(Color.WHITE);
		this.frame = frame;
		this.card = card;

		setLayout(new BorderLayout());
		try {
			table = new JTable(new AgendaDiariaTableModel());
		} catch (Exception e) {
			e.printStackTrace();
		}

		add(BorderLayout.CENTER, table);

		JButton button = new JButton(new AgendaFecharAction(this));
		button.setToolTipText("Cancelar cadastro da conta");
		button.setMnemonic(KeyEvent.VK_N);
		add(BorderLayout.SOUTH, button);
	}

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
            JFrame frame = new JFrame("Teste");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.getContentPane().add(new JAgendaDiariaPanel(null, null));

            frame.pack();
            frame.setVisible(true);
    }

    public static void main(String[] args) {
            // Schedule a job for the event-dispatching thread:
            // creating and showing this application's GUI.
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                            createAndShowGUI();
                    }
            });
    }
}
