package com.nmspringstack.service;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "todo.service", ignoreUnknownFields = false)
@Component
public class ServiceProperties {
	
	//TODO Change Name
	
	@NotNull // you can also create configurationPropertiesValidator
	private String name = "Todo Service";
	
	//TODO Change Desc
	@NotNull // you can also create configurationPropertiesValidator
	private String description = "Todo Service Description";

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
