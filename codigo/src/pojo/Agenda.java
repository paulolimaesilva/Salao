package pojo;

import java.util.Date;

public class Agenda {
	private int codigo;
	private Profissional p;
	private Cliente c;
	private Date data;
	private String hora;

	public Agenda(Profissional p, Cliente c, Date data, String hora) {
		super();
		this.p = p;
		this.c = c;
		this.data = data;
		this.hora = hora;
	}
	
	public Agenda(int codigo, Profissional p, Cliente c, Date data, String hora) {
		super();
		this.codigo = codigo;
		this.p = p;
		this.c = c;
		this.data = data;
		this.hora = hora;
	}

	public Profissional getP() {
		return p;
	}

	public void setP(Profissional p) {
		this.p = p;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public java.sql.Date getData() {
		return (java.sql.Date) data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Agenda [codigo=" + codigo + ", p=" + p + ", c=" + c + ", data="
				+ data + ", hora=" + hora + "]";
	}

	
}
