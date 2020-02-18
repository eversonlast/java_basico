package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor digite um trecho do nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas where nome like ?";
		
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%"+nome+"%");
		ResultSet resultado = stmt.executeQuery();
		
		
		List<Pessoas> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome1 = resultado.getString("nome");
			pessoas.add(new Pessoas(codigo, nome1));
		}
		
		for(Pessoas p: pessoas) {
			System.out.println(p.getCodigo()+" ==> "+p.getNome());
		}
		System.out.println("Sair!!!");
		
		stmt.close();
		entrada.close();
		conexao.close();
	}
}
