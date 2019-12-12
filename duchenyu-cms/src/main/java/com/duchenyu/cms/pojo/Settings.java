package com.duchenyu.cms.pojo;

import java.io.Serializable;

public class Settings implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String te_domain;
	private String te_name;
	private Integer ticle_list_size;
	private Integer ide_size;
	private String min_username;
	private String min_password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTe_domain() {
		return te_domain;
	}
	public void setTe_domain(String te_domain) {
		this.te_domain = te_domain;
	}
	public String getTe_name() {
		return te_name;
	}
	public void setTe_name(String te_name) {
		this.te_name = te_name;
	}
	public Integer getTicle_list_size() {
		return ticle_list_size;
	}
	public void setTicle_list_size(Integer ticle_list_size) {
		this.ticle_list_size = ticle_list_size;
	}
	public Integer getIde_size() {
		return ide_size;
	}
	public void setIde_size(Integer ide_size) {
		this.ide_size = ide_size;
	}
	public String getMin_username() {
		return min_username;
	}
	public void setMin_username(String min_username) {
		this.min_username = min_username;
	}
	public String getMin_password() {
		return min_password;
	}
	public void setMin_password(String min_password) {
		this.min_password = min_password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Settings(Integer id, String te_domain, String te_name, Integer ticle_list_size, Integer ide_size,
			String min_username, String min_password) {
		super();
		this.id = id;
		this.te_domain = te_domain;
		this.te_name = te_name;
		this.ticle_list_size = ticle_list_size;
		this.ide_size = ide_size;
		this.min_username = min_username;
		this.min_password = min_password;
	}
	public Settings() {
		super();
	}
	@Override
	public String toString() {
		return "Settings [id=" + id + ", te_domain=" + te_domain + ", te_name=" + te_name + ", ticle_list_size="
				+ ticle_list_size + ", ide_size=" + ide_size + ", min_username=" + min_username + ", min_password="
				+ min_password + "]";
	}
	
	

}
