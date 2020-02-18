package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistro2 {

	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor digite o id que queira excluir: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String delete = "DELETE FROM pessoas WHERE codigo = ?";
		String select = "SELECT * FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		
		if(resultado.next()) {
			Pessoas p = new Pessoas(resultado.getInt(1), resultado.getString(2));
			System.out.println("Você deseja excluir este cadastro: " + p.getCodigo() + " ===> " + p.getNome());
			System.out.print("Digite S = Sim e N = Não: ");
			String opcao = entrada.next();
			
			if("S".equalsIgnoreCase(opcao)) {
				stmt.close();
				stmt = conexao.prepareStatement(delete);
				stmt.setInt(1, codigo);
				stmt.execute();
				System.out.println("A pessoas excluída com sucesso!");
			}else if("N".equalsIgnoreCase(opcao)) {
				System.out.println("Obrigado!!!");
				stmt.close();
			}
		}else {
			System.out.println("Não existe este id cadastrado!!!");
		}
		
		
		
		conexao.close();
		entrada.close();
	}
}
