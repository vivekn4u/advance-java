/**
 * 
 */
package org.cdac.com.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author vivekn4u
 *
 */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserEntity {
	//instance variables
//	@NonNull 
	private int userid;
//	@NonNull 
	private String name;
//	@NonNull
	private String password;
//	@NonNull
	private String date;
	
	public UserEntity() {
	}
	
	/**
	 * @param userid
	 * @param name
	 * @param password
	 * @param date
	 */
	public UserEntity(int userid, String name, String password, String date) {
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.date = date;
	}


	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}


	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj == null)
		{
			return false;
		}
		if (obj == this)
		{
			return true;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		
		UserEntity item = (UserEntity) obj;
		return (this.getUserid() == item.getUserid());
	}


	@Override
	public String toString() {
		return "["+userid+","+name+","+password+","+date+","+"]";
	}
	
	
	
	
}
