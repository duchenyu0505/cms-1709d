package com.duchenyu.cms.pojo;

import java.io.Serializable;

public class Comment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer artcleId;
	private Integer userId;
	private String content;
	private String created;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArtcleId() {
		return artcleId;
	}
	public void setArtcleId(Integer artcleId) {
		this.artcleId = artcleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Comment(Integer id, Integer artcleId, Integer userId, String content, String created) {
		super();
		this.id = id;
		this.artcleId = artcleId;
		this.userId = userId;
		this.content = content;
		this.created = created;
	}
	public Comment() {
		super();
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", artcleId=" + artcleId + ", userId=" + userId + ", content=" + content
				+ ", created=" + created + "]";
	}
	
	

}
