package com.capgemini.boot.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jdbc")
public class DBConnection {
	private String driverClassName;
	private String url;
	private String userName;
	private String password;
	
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DBConnection [driverClassName=" + driverClassName + ", url=" + url + ", userName=" + userName
				+ ", password=" + password + "]";
	};	
}

