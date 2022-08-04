/**
 * 
 */
package org.cdac.com.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

/**
 * @author vivekn4u
 *
 */
//@Data
//@AllArgsConstructor
//@ToString
public class ItemsEntity {
	//instance variable / state
//	@NonNull
	private int itemid;
//	@NonNull
	private String name;
//	@NonNull
	private int price;
	private String image;
	
	/**
	 * @author vivekn4u
	 * @param itemid
	 * @param name
	 * @param price
	 * @param image
	 * constructor using fields
	 */
	public ItemsEntity(int itemid, String name, int price, String image) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.price = price;
		this.image = image;
	}

	/**
	 * @return the itemid
	 */
	public int getItemid() {
		return itemid;
	}

	/**
	 * @param itemid the itemid to set
	 */
	public void setItemid(int itemid) {
		this.itemid = itemid;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @author vivekn4u
	 * generate unique hash code per id and name
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * @author vivekn4u
	 * check he equality of user defined objects
	 */
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
		
		ItemsEntity item = (ItemsEntity) obj;
		return (this.getItemid() == item.getItemid());
	}

	@Override
	public String toString() {
		return "["+itemid+","+name+","+price+","+image+","+"]";
	}
	
	
	
	
	
}
