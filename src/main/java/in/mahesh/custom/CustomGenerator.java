package in.mahesh.custom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String suffix="19911A0";
		String prefix="";
		try {
			JdbcConnectionAccess con = session.getJdbcConnectionAccess();
			Connection connection = con.obtainConnection();
			Statement statement = connection.createStatement();
			String sql="SELECT ORDERID FROM ORDERPRIMARY";
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				int orderId=resultSet.getInt(1);
				prefix=String.valueOf(orderId);
				int i=orderId++;
				String sql2="UPDATE ORDERPRIMARY SET ORDERID=? WHERE ORDERID=?";
				PreparedStatement pst = connection.prepareStatement(sql2);
				pst.setInt(1, i);
				pst.setInt(2, orderId);
				pst.executeUpdate();
				System.out.println(suffix+prefix);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return suffix+prefix;
	}

}
