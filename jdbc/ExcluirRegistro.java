package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistro {
		public static void main(String[] args) throws SQLException{
			Scanner entrada = new Scanner(System.in);
			Connection conexao = FabricaConexao.getConexao();
			
			String sql = "DELETE FROM pessoas WHERE codigo = ?";
			
			System.out.print("Informe o código: ");
			int codigo = entrada.nextInt();
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			int contador = stmt.executeUpdate();
			
			if(contador > 0 ) {
				System.out.println("Pessoa excluída com sucesos!!!");
				System.out.println("Linhas afetadas: "+ contador);
			}else {
				System.out.println("Não existe este código!!!");
			}
			
			conexao.close();
			entrada.close();
		}
}
