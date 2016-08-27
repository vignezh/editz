package com.vig.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Entity(name="PRODUCT")
@Component
public class Product {
	@NotNull
	private String productId;
	@NotNull
	private String name;
	@NotNull
	private String quantity;
	@NotNull
	private float price;
	@NotNull
	private String category;
	@NotNull
	// @Size(min = 6, max = 12, message = "please enter a valid size")
	private byte size;
	@NotNull
	private String desc;
	/*@Column
	@NotNull
	private String imagename;
	
	@Transient
	private MultipartFile image;
	
	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}*/
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public byte getSize() {
		return size;
	}

	public void setSize(byte size) {
		this.size = size;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Id
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	

	public void setPrice(float price) {
		this.price = price;
	}

}
