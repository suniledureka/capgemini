package com.capgemini.boot.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties
@PropertySource(value = "classpath:dbconfig.properties")
@ConfigurationProperties(prefix = "jdbc")
public class DBConnection {
	private String driverClass;
	private String url;
	private String usrName;
	private String password;
	
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsrName(String userName) {
		this.usrName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DBConnection [driverClass=" + driverClass + ", url=" + url + ", userName=" + usrName + ", password="
				+ password + "]";
	}	
}
