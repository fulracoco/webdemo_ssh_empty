package com.tk.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Leo
 * @date:2016-9-21 下午9:09:11
 * @version :
 * 
 */
public class User {
	 private Integer u_id;  
	 private String u_name;  
	 private Set<Service> services = new HashSet<Service>();
	 
	public User(Integer u_id, String u_name, Set<Service> services) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.services = services;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public Set<Service> getServices() {
		return services;
	}
	public void setServices(Set<Service> services) {
		this.services = services;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", services="
				+ services.toString() + "]";
	}
	 
}
