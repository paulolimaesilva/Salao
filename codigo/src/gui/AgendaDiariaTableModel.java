package gui;

import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import pojo.Agenda;
import pojo.Profissional;
import dao.SalaoDAO;

public class AgendaDiariaTableModel extends AbstractTableModel {

	private Profissional p;
	private List<Agenda> agenda;

	public AgendaDiariaTableModel(Profissional p) throws Exception {
		this.p = p;
		SalaoDAO dao = new SalaoDAO();
		agenda = dao.findAgendaDiaria(p);
	}

	@Override
	public int getColumnCount() {

		return 1;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	public Object getValueAt(int lin, int col) {
		System.out.println(lin);
		Agenda m = agenda.get(lin);
		switch (lin) {
		case 0:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "9:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 1:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "9:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 2:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "10:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 3:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "10:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 4:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "11:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 5:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "11:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 6:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "12:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 7:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "12:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 8:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "13:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 9:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "13:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 10:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "14:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 11:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "14:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 12:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "15:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 13:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "15:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 14:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "16:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 15:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "16:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 16:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "17:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 17:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "17:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 18:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "18:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 19:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "18:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 20:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "19:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 21:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "19:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 22:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "20:00")
						return m.getC().getNome();
					else return "Horário vago";
			}
		case 23:
			for(int i = 0; i<agenda.size(); i++){
				if(agenda.get(i).getData() == new Date())
					if(agenda.get(i).getHora() == "20:30")
						return m.getC().getNome();
					else return "Horário vago";
			}
		default:
			return "*ERRO*";
		}

	}

}
