package Test;

import DAO.SalaoDAO;
import POJO.Atendimento;
import POJO.Cliente;
import POJO.Produto;
import POJO.Profissional;

public class Teste {
	
	public static void main(String[] args) {
		SalaoDAO dao = new SalaoDAO();
		
//		Cliente cliente = new Cliente("Teste de conex�o DAO", "5555-5555", "a@a.com", "lalalalala");
//		dao.insertCliente(cliente);
//		
//		Profissional prof = new Profissional("Teste de conex�o DAO", "5555-5555", "lalalalalala", "a@a.com", "00000000000");
//		dao.insertProfissional(prof);
		
		Atendimento atend = new Atendimento(2, 2, 0, 345.67);
		dao.insertAtendimento(atend);
		
//		Produto prod = new Produto(789, "texte de conex�o DAO", 10, 15, 100, 30);
//		dao.insertProduto(prod);
		
		
		Cliente cliente;
		System.out.println(dao.findClienteByNome("Teste de Conex�o DAO"));
		//System.out.println(cliente.toString());
		
	}

}
