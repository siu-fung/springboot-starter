package cn.jbinfo.learning.springboot.starter.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix=SwaggerProperties.SWAGGER_PREFIX)
public class SwaggerProperties {

public static final String SWAGGER_PREFIX = "swagger";
	
	private String title;
	
	private String description;
	
	private String version;
	
	private String basePackage;
	
	
	
}
