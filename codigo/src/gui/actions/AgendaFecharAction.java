package gui.actions;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import gui.JAgendaDiariaPanel;

public class AgendaFecharAction extends AbstractAction {
        /**
         * 
         */
        private static final long serialVersionUID = 1L;
        
        /**
         * 
         */
        private JAgendaDiariaPanel panel;

        /**
         * 
         * @param jExtratoPanel
         */
        public AgendaFecharAction(JAgendaDiariaPanel jAgendaPanel) {
                super("Fechar");
                this.panel = jAgendaPanel;
        }

        @Override
        public void actionPerformed(ActionEvent arg0) {
                //panel.clear();
                CardLayout card = panel.getCard();
                JFrame frame = panel.getFrame();
                card.show(frame.getContentPane(), "Vazio");                
        }

}