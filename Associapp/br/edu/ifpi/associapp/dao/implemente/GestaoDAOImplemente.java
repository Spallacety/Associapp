package br.edu.ifpi.associapp.dao.implemente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.associapp.dao.ConnectionFactory;
import br.edu.ifpi.associapp.dao.GestaoDAO;
import br.edu.ifpi.associapp.dao.GestorDAO;
import br.edu.ifpi.associapp.enuns.CargoEnum;
import br.edu.ifpi.associapp.modelo.Gestao;
import br.edu.ifpi.associapp.modelo.Gestor;

public class GestaoDAOImplemente implements GestaoDAO{
	
	private Connection conn;
	
//	@Override
//	public Gestor inserirGestor(Gestor g) {
//		conn = ConnectionFactory.getConnection();
//		
//		try {
//			Statement s = conn.createStatement();
//			String sql = "INSERT INTO membro(id_gestao, id_pessoa, cargo) "
//					+ "values(" + g.getId_gestao()+ ", " + g.getId_pessoa()+ "',"
//					+g.getCargo() + "')";
//			
//			System.out.println(sql);
//			s.executeUpdate(sql);
//			System.out.println("Gestor inserido com sucesso!!");
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Erro ao inserir Gestor!");
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return g;
//	}

	

//	@Override
//	public Gestor retornarGestorPorId(int id) {
//		conn = ConnectionFactory.getConnection();
//		Gestor g = null;
//		try {
//			String sql = "select * from gestor where id = " + id;
//			Statement stmt = conn.createStatement();
//			ResultSet resultado = stmt.executeQuery(sql);
//			
//			g = new Gestor();
//			g.setId(resultado.getInt("id"));
//			g.setId_gestao(resultado.getInt("id_gestao"));
//			g.setId_pessoa(resultado.getInt("id_pessoa"));
//			g.setCargo(CargoEnum.valueOf(resultado.getString("cargo")));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return g;
//		
//	}

//	@Override
//	public void removerGestor(int id) {
//		conn = ConnectionFactory.getConnection();
//		try {
//			Statement s = conn.createStatement();
//			String sql = "DELETE from gestor where id = " +id;
//			
//			s.executeUpdate(sql);
//		
//			System.out.println("Gestor deletado com sucesso!!");
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Erro ao deletar Gestor!");
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//	}

	

//	@Override
//	public List<Gestor> BuscarPorNome(String nome) {
//		conn = ConnectionFactory.getConnection();
//		List<Gestor> listaGestores = new ArrayList<>();
//		String sql = "SELECT * FROM gestor g inner join membro m on m.id = g.id_pessoa"
//				+ " where m.nome like '%"+ nome +"%'";
//		System.out.println(sql);
//		try {
//			Statement stmt = conn.createStatement();
//			ResultSet resultado = stmt.executeQuery(sql);
//			while (resultado.next()) {
//				Gestor g = new Gestor();
//				g.setId(resultado.getInt("id"));
//				g.setId_gestao(resultado.getInt("id_gestao"));
//				g.setId_pessoa(resultado.getInt("id_pessoa"));
//				g.setCargo(CargoEnum.valueOf(resultado.getString("cargo")));
//				listaGestores.add(g);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return listaGestores;
//	}



	@Override
	public Gestao adicionarGEstao(Gestao gestao) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Gestao retornarGestaorPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void removerGestao(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Gestao> listaGestao() {
		conn = ConnectionFactory.getConnection();
		List<Gestao> listaGestao = new ArrayList<>();
		String sql = "SELECT * FROM gestao";
		System.out.println(sql);
		try {
			Statement stmt = conn.createStatement();
			ResultSet resultado = stmt.executeQuery(sql);
			while (resultado.next()) {
				Gestao g = new Gestao();
				g.setId(resultado.getInt("id"));
				g.setId_comunidade(resultado.getInt("id_comunidade"));
				g.setNome(resultado.getString("nome"));
				listaGestao.add(g);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listaGestao;
	}



	@Override
	public List<Gestao> BuscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
