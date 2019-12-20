package com.duchenyu.cms.pojo;

import java.io.Serializable;
import java.util.Date;

import com.dcy.DateUtil;



public class User implements Serializable{
	  /**   
		 * @Fields serialVersionUID : TODO(这个变量表示什么)   
		 */  
		private static final long serialVersionUID = 1L;

		private Integer id;

	    private String username;

	    private String password;

	    private String nickname;

	    private Date birthday;

	    private Integer gender;

	    private Integer locked;

	    private int score;

	    private String role;

	    private String url;

	    private Date createTime;

	    private Date updateTime;
	    
	    private String headimg;
	   
	    public boolean isAdmin() {
	    	return "1".equals(getRole());
	    }
	    
	    public String getBirthdayStr() {
	    	if(this.getBirthday()==null) {
	    		return null;
	    	}
	        return DateUtil.format(this.getBirthday());
	    }

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

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
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

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
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

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

		public Date getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}

		public String getHeadimg() {
			return headimg;
		}

		public void setHeadimg(String headimg) {
			this.headimg = headimg;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public User() {
			super();
		}

		public User(Integer id, String username, String password, String nickname, Date birthday, Integer gender,
				Integer locked, int score, String role, String url, Date createTime, Date updateTime, String headimg) {
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
			this.createTime = createTime;
			this.updateTime = updateTime;
			this.headimg = headimg;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
					+ ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked + ", score=" + score
					+ ", role=" + role + ", url=" + url + ", createTime=" + createTime + ", updateTime=" + updateTime
					+ ", headimg=" + headimg + "]";
		}

	   
}
