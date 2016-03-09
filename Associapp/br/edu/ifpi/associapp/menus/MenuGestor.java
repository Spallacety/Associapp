package br.edu.ifpi.associapp.menus;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.edu.ifpi.associapp.aplicacao.App;
import br.edu.ifpi.associapp.dao.ComunidadeDAO;
import br.edu.ifpi.associapp.dao.ComunidadeJDBCDAO;
import br.edu.ifpi.associapp.dao.GestaoDAO;
import br.edu.ifpi.associapp.dao.GestorDAO;
import br.edu.ifpi.associapp.dao.MembroDAO;
import br.edu.ifpi.associapp.dao.implemente.GestaoDAOImplemente;
import br.edu.ifpi.associapp.dao.implemente.GestorDAOImplemente;
import br.edu.ifpi.associapp.dao.implemente.MembroDAOImplemente;
import br.edu.ifpi.associapp.enuns.CargoEnum;
import br.edu.ifpi.associapp.modelo.Comunidade;
import br.edu.ifpi.associapp.modelo.Gestao;
import br.edu.ifpi.associapp.modelo.Gestor;
import br.edu.ifpi.associapp.modelo.Membro;

public class MenuGestor {
	private static GestorDAO gestorDAO = new GestorDAOImplemente();
	private static MembroDAO membroDAO = new MembroDAOImplemente();
	private static GestaoDAO gestaoDAO = new GestaoDAOImplemente();
	private static ComunidadeDAO comunidadeDAO = new ComunidadeJDBCDAO();
	
	public static void menuGestor() {
		String submenu ="1 - Adicionar Gestor\n"
				+ "2 - Consultar Gestor por nome\n"
				+ "3 - Listar todos os gestores\n"
				+ "4 - Remover Gestor\n"
				+ "0 - Retornar ao menu principal\n";
		
		while(true){
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(submenu));
			switch (op){
			case 1:
				novoGestor();
				break;
			case 2:
				String n = JOptionPane.showInputDialog("Digite o nome procurado: ");
				buscarGestor(n);
				break;	
			case 3:
				String listaDeGestores = lista();
				JOptionPane.showMessageDialog(null, listaDeGestores);

				break;
			case 4:
				removerGestor();
				break;	
			case 0:
				App.menuPrincipal();
				break;
//			default:
//				JOptionPane.showMessageDialog(null, "Opção Invalida!");
//				break;
			}
			if (op == 0)
				break;
			
			
		}
				
	}
	
	public static void novoGestor() {
		//Selecionar a gestao
		UIManager.put("OptionPane.okButtonText", "Proximo");
		
		Comunidade c;
		String texto="";
		for (Gestao gestao : gestaoDAO.listaGestao()) {
			c = comunidadeDAO.obter(gestao.getId_comunidade());
			texto += gestao.getId()+" - "+ gestao.toString()+ "Comunidade: " +c.getNome() +"\n";
		}
		
		int id_gestao = Integer.valueOf(JOptionPane.showInputDialog(texto + "\n\nEscolha o numero correspondente a gestao: "));
		
		//Seleionar a pessoa
		UIManager.put("OptionPane.okButtonText", "Proximo");
		String texto2= "";
		for (Membro m : membroDAO.listaMembros()) {
			texto2 += m.getId()+" - " + m.toString();
		}
		
		int id_pessoa = Integer.valueOf(JOptionPane.showInputDialog(texto2 + "\n\nEscolha  o numero correspondente ao gestor: "));
		
		//selecionar o cargo
		String cargos = CargoEnum.retornaValores();
		UIManager.put("OptionPane.okButtonText", "Fim");
		int id_cargo = Integer.valueOf(JOptionPane.showInputDialog(cargos + "\n\n Escolha o numero correspondente ao cargo"));
		Gestor g = new Gestor();
		g.setId_gestao(id_gestao);
		g.setId_pessoa(id_pessoa);
		if(id_cargo == 1){
			g.setCargo(CargoEnum.PRESIDENTE);
		}else if(id_cargo==2){
			g.setCargo(CargoEnum.VICE_PRESIDENTE);
		}else if(id_cargo ==3){
			g.setCargo(CargoEnum.TESOREIRO);
		}else if(id_cargo == 4){
			g.setCargo(CargoEnum.SECREARIO);
		}
	
		g = gestorDAO.inserirGestor(g);

		JOptionPane.showMessageDialog(null, "Gestor inserido com sucesso!!!");
	}
	
	public static void buscarGestor(String nome) {
		List<Gestor>listaBusca ;
		listaBusca = gestorDAO.BuscarPorNome(nome);
	
		Membro m;
//		Comunidade c;
		String texto = "";
		for (Gestor g : listaBusca) {
			m= membroDAO.retornarMembroPorId(g.getId_pessoa());
			texto += g.getId()+" - "+ "Nome: "+m.getNome()+" - " +  g.toString();
		}
		
				
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public static String lista() {
		
		Membro m;
		String texto = "";
		for (Gestor g : gestorDAO.listaGestores()) {
			m= membroDAO.retornarMembroPorId(g.getId_pessoa());

			texto += g.getId()+" - "+ "Nome: "+m.getNome()+" - " +  g.toString();
		}
		
		return texto;
		
	}
	
	public static void removerGestor() {
		String texto = lista();
		int id = Integer.valueOf(JOptionPane.showInputDialog(texto +"\n\nDigite o numero correspondente ao gestor"));
		
		gestorDAO.removerGestor(id);
	}
}
