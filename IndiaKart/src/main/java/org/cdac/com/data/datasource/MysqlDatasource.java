/**
 * 
 */
package org.cdac.com.data.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

import org.cdac.com.service.entity.UserEntity;

/**
 * @author vivekn4u
 *
 */
public class MysqlDatasource {
	
	//private instance variables
	private String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/indiakartdb?allowPublicKeyRetrieval=true&useSSL=false";
	private String mysqlUser = "root";
	private String mysqlPass = "Test#12345";
	
	//private sql queries
	private static String getUser = "select * from user where name=? and password=?";
	
	/**
	 * get the connection
	 * @return
	 * @throws SQLException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	private Connection getJdbcConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		Connection con = null;
		
		// new construct()
		//Class.forName()
		//clone()
		
		
		Class.forName(mysqlDriver);
		
		con = DriverManager.getConnection(jdbcUrl, mysqlUser,mysqlPass);		
		
		return con;
		
		
	}
	
	/**
	 * 
	 * @param user
	 * @return UserEntity
	 * 
	 */
	public UserEntity isUserExist(UserEntity user) {
		try(Connection con = getJdbcConnection()){
			PreparedStatement pStm = con.prepareStatement(getUser);
			pStm.setString(1, user.getName());
			pStm.setString(2, user.getPassword());
			
			// execute the statement
			ResultSet rs=  pStm.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("userid");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String date = rs.getString("date");
				UserEntity newUser = new UserEntity(id, name, password, date);
				return newUser;
			}
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		} 
			
		return null;
		
		
	}
	
	
	
	
}
