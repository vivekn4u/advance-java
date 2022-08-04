/**
 * 
 */
package org.cdac.com.data.repository;


import org.cdac.com.data.datasource.MysqlDatasource;
import org.cdac.com.service.entity.UserEntity;

/**
 * @author vivekn4u
 * this repository class has all the datasources registered to it
 * and used as per the requirement
 */
public class UserRepository {
	
	//mysql data source register
	private MysqlDatasource mysqlDatasource = new MysqlDatasource();

	/**
	 * this method checks the user in database
	 * @param user
	 * @return
	 */
	public UserEntity checkAuthUsers(UserEntity user){
		//check the mysql data source if the user exist
		UserEntity users = mysqlDatasource.isUserExist(user);			
		
		return users;
	}
	
}
