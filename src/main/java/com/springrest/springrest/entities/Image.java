package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Image {


	@Id
	private long id;
	private String url;
	private String description;
	private String name;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(long id, String url,  String name,String description) {
		super();
		this.id = id;
		this.url = url;
		this.description = description;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", url=" + url + ", description=" + description + ", name=" + name + "]";
	}
	
	
}
