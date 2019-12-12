package com.duchenyu.cms.pojo;

import java.io.Serializable;

public class VoteContent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public VoteContent(Integer id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public VoteContent() {
		super();
	}
	@Override
	public String toString() {
		return "VoteContent [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
