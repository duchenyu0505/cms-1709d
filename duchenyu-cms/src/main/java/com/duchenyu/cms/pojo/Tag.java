package com.duchenyu.cms.pojo;

import java.io.Serializable;

public class Tag implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String tagname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Tag(Integer id, String tagname) {
		super();
		this.id = id;
		this.tagname = tagname;
	}
	public Tag() {
		super();
	}
	@Override
	public String toString() {
		return "Tag [id=" + id + ", tagname=" + tagname + "]";
	}
	
	
}
