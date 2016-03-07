package br.edu.ifpi.associapp.aplicacao;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.edu.ifpi.associapp.dao.ComunidadeDAO;
import br.edu.ifpi.associapp.dao.ComunidadeJDBCDAO;
import br.edu.ifpi.associapp.enuns.TipoDeComunidadeEnum;
import br.edu.ifpi.associapp.modelo.Comunidade;
import br.edu.ifpi.associapp.modelo.Endereco;
import br.edu.ifpi.associapp.modelo.Familia;

public class App {
	
	public static void main(String[] args) {

		ComunidadeDAO dao = new ComunidadeJDBCDAO();
		
		String menu = "#### ASSOCIAPP ####\n\n";
		menu += "1 - Adicionar Comunidade\n"
				+ "2 - Vizualizar Comunidade\n"
				+ "3 - Listar as comunidades\n"
				+ "4 - Remover comnunidade\n"
				+ "0 - Sair\n";
		
		while(true){
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op){
			case 1:
				novaComunidade(dao);
				break;
			case 2:
				entrarNaComunidade(dao);
				break;
			case 3:
				listarComunidades(dao);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Volte Sempre!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida!");
				break;
			}
			if (op == 0)
				break;
			
			
		}
				
		
		
		
		
	}

	private static void listarComunidades(ComunidadeDAO dao) {
		String l = "LISTA\n";
		for (Comunidade c : dao.lista()) {
			l += c.toString();
		}
		JOptionPane.showMessageDialog(null, l);
		
	}

	private static void entrarNaComunidade(ComunidadeDAO dao) {
		Comunidade c = new Comunidade();
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da comunidade: "));
		c = dao.obter(id);
		String submenu = "Comunidade: " + c.getNome() + "\n\n";
		submenu += "1 - Adicionar Familia\n"
				+ "2 - Vizualizar Familia\n"
				+ "3 - Adicionar Dados da Comunidade\n"
				+ "0 - Voltar";
		
		while(true){
			int op2 = Integer.parseInt(JOptionPane.showInputDialog(submenu));
			switch (op2){
			case 1:
				novaFamilia(dao, c);
				break;
			case 2:
				vizualizarFamilia(dao);
				break;
			case 3:
				addDadosDaComunidade(dao);
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida!");
				break;
			}
			if (op2 == 0)
				break;
			
			
		}
		
	}

	private static void addDadosDaComunidade(ComunidadeDAO dao) {
		
	}

	private static void vizualizarFamilia(ComunidadeDAO dao) {
		
	}

	private static void novaFamilia(ComunidadeDAO dao, Comunidade c) {
		Familia f = new Familia();
		UIManager.put("OptionPane.okButtonText", "Proximo");
		String rua = JOptionPane.showInputDialog("Rua: ");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("numero: "));
		UIManager.put("OptionPane.okButtonText", "Fim");
		String cep = JOptionPane.showInputDialog("Cep: ");
		Endereco end = new Endereco(rua, numero, cep);
		f.setEndereco(end);
		f = dao.inserirFamilia(c, f);
		UIManager.put("OptionPane.okButtonText", "Ok");
		JOptionPane.showMessageDialog(null, "Inseriu com sucesso. Id gerado: "+f.getCodigo()+"!");
	}

	private static void novaComunidade(ComunidadeDAO dao) {
		Comunidade c = new Comunidade();
		UIManager.put("OptionPane.okButtonText", "Proximo");
		String nome = JOptionPane.showInputDialog("Nome: ");
		String opcoes = "1 - BAIRRO\n"
				+ "2 - POVOADO";
		int tipo = Integer.parseInt(JOptionPane.showInputDialog(opcoes));
		UIManager.put("OptionPane.okButtonText", "Fim");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade Minima Do Lider: "));
		c.setNome(nome);
		c.setTipo(TipoDeComunidadeEnum.fromInteger(tipo));
		c.setIdadeMinimaLider(idade);;
		c = dao.inserir(c);
		UIManager.put("OptionPane.okButtonText", "Ok");
		JOptionPane.showMessageDialog(null, "Inseriu com sucesso. Id gerado: "+c.getCodigo()+"!");
		
	}

}
