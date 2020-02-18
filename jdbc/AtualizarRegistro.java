package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor digite o id da pessoa que quer atualizar: ");
		int codigo = entrada.nextInt();
			
		
		Connection conexao = FabricaConexao.getConexao();
		String Select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String Update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(Select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoas p = new Pessoas(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();
			
			System.out.print("Por favor digite o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(Update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa Alterada com Sucesso!!!");
		}else {
			System.out.println("Pessoas não existe no cadastro!!!");
		}
		
		
		System.out.println("Sair!!!");
		
		stmt.close();
		entrada.close();
		
	}

}
