package org.inventory.transaction.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private int itemid;
	
	private String itemname;
	
	private String itemdescription;
	
	private byte[] image;
	
	private double price;
	
	private double quality;

	public Item(int itemid, String itemname, String itemdescription,
			byte[] image, double price, double quality) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemdescription = itemdescription;
		this.image = image;
		this.price = price;
		this.quality = quality;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemdescription() {
		return itemdescription;
	}

	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuality() {
		return quality;
	}

	public void setQuality(double quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname
				+ ", itemdescription=" + itemdescription + ", image="
				+ Arrays.toString(image) + ", price=" + price + ", quality="
				+ quality + "]";
	}
	
	
}
