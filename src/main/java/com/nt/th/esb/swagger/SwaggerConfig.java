package com.nt.th.esb.swagger;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Kritsana J. on 23/03/2564.
 */	
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/*
	 * http://localhost:90/swagger-ui.html
	 * http://10.0.102.38:8080/ESB2PlusCRM/swagger-ui.html
	 * 
	 * http://10.0.102.38:8080/ESB2PlusCRM/v2/api-docs
	 */	
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.nt.th.esb.controllers"))
				.paths(regex("/rest/TOTBilling.*"))
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("ESB2Plus CRM API")
				.description("Restful Springboot")
				.contact("krisana.j@nt.ntplc.co.th")
				.version("1.0.0.0").build();
	}



}