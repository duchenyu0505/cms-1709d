package com.duchenyu.cms.pojo;

import java.io.Serializable;

public class Me implements Serializable{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Integer id;
		private String name;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Me(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Me() {
			super();
		}
		@Override
		public String toString() {
			return "Me [id=" + id + ", name=" + name + "]";
		}
		
		
}
