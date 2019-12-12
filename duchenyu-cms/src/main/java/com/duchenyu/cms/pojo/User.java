package com.duchenyu.cms.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	/**
	 * 序列版本号
	 * */
	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private String birthday;
	private Integer gender;
	private Integer locked;
	private Integer score;
	private String role;
	private String url;
	private Date createtime;
	private Date updatetime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreate_time(Date createtime) {
		this.createtime = createtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public User(Integer id, String username, String password, String nickname, String birthday, Integer gender,
			Integer locked, Integer score, String role, String url, Date createtime, Date updatetime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.birthday = birthday;
		this.gender = gender;
		this.locked = locked;
		this.score = score;
		this.role = role;
		this.url = url;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked + ", score=" + score
				+ ", role=" + role + ", url=" + url + ", createtime=" + createtime + ", updatetime=" + updatetime
				+ "]";
	}

	
}
