package com.test.application;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



@Component
@ConfigurationProperties(prefix="db")
public class DBSettings {
	private String host;
	private String port;
	private String username;
	private String password;
	private String database;
	
}
