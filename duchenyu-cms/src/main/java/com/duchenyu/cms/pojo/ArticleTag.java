package com.duchenyu.cms.pojo;

import java.io.Serializable;

public class ArticleTag implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer aid;
	private Integer tid;
	
	
	public Integer getAid() {
		return aid;
	}


	public void setAid(Integer aid) {
		this.aid = aid;
	}


	public Integer getTid() {
		return tid;
	}


	public void setTid(Integer tid) {
		this.tid = tid;
	}


	
	public ArticleTag(Integer aid, Integer tid) {
		super();
		this.aid = aid;
		this.tid = tid;
	}




	@Override
	public String toString() {
		return "ActicleTag [aid=" + aid + ", tid=" + tid + "]";
	}
	
	
}
