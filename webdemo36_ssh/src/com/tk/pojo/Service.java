package com.tk.pojo;
/**
 * @author: Leo
 * @date:2016-10-15 下午2:29:02
 * @version :
 * 
 */
public class Service {
	private Integer s_id;
	private User user;
	private String service_code;
	private String service_name;
	public Service(Integer s_id, User user, String service_code,
			String service_name) {
		super();
		this.s_id = s_id;
		this.user = user;
		this.service_code = service_code;
		this.service_name = service_name;
	}
	public Service() {
		super();
	}
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	@Override
	public String toString() {
		return "Service [s_id=" + s_id + ", user=" + user.getU_id() + ", service_code="
				+ service_code + ", service_name=" + service_name + "]";
	}
	
}
