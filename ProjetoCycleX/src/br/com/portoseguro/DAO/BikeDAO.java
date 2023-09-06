package br.com.portoseguro.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.portoseguro.beans.Bike;
import br.com.portoseguro.conexoes.ConnectionFactory;

public class BikeDAO {

	public Connection minhaConexao;
	
// ============ CONSTRUTOR =============

	public BikeDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConnectionFactory().conexao();
	}
	
// ========== MÉTODO INSERT ============
	public String inserir(Bike bike) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(" insert into T_FIAP_PORTO_BIKE values(?, ?, ?, ?)");
		stmt.setDouble(1, bike.getPrecoBike());
		stmt.setString(2, bike.getMarca());
		stmt.setInt(3, bike.getAno());
		stmt.setString(4, bike.getTipo());
		stmt.execute();
		stmt.close();
		
		return "\n==========================================" + 
				"\nSua bike foi cadastrada com sucesso!" +
				"\n==========================================";
	}
}
