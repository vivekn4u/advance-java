/**
 * 
 */
package org.cdac.com.service.usecase;

import org.cdac.com.data.repository.UserRepository;
import org.cdac.com.service.entity.UserEntity;

/**
 * @author vivekn4u
 *
 */
public class AuthUsecase {
	
	
	private UserRepository userRepository = new UserRepository();
	
	/**
	 * @author vivekn4u
	 * @param String
	 * @param String
	 * this method will return if the user is authorized or not
	 */
	public UserEntity isUserAuthorized(String name, String password){
		
		UserEntity user = new UserEntity(-1, name, password, "");
		
		return userRepository.checkAuthUsers(user);		
		
	}
}
