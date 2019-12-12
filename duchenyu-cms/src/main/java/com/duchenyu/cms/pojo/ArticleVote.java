package com.duchenyu.cms.pojo;

import java.io.Serializable;

public class ArticleVote implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer articleId;
	private Integer userId;
	private String option;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ArticleVote(Integer id, Integer articleId, Integer userId, String option) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.userId = userId;
		this.option = option;
	}
	public ArticleVote() {
		super();
	}
	@Override
	public String toString() {
		return "ArticleVote [id=" + id + ", articleId=" + articleId + ", userId=" + userId + ", option=" + option + "]";
	}
	
	
	
}
