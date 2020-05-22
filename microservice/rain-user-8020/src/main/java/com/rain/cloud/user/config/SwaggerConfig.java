package com.rain.cloud.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * SwaggerConfig
 */
@Configuration
public class SwaggerConfig {

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("会员服务 API")
				.description(initContextInfo())
				.termsOfServiceUrl("XXXXXXXXXXXX")
				.contact("陪你度过漫长的岁月")
				.version("1.0")
				.build();
	}

	private String initContextInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("以下是系统提供的RESTful API").append("<br/>")
				.append("<font color='red'>请注意与后端交互时直接使用域名加上服务名不要指定端口。</font>").append("<br/>")
				.append("例：访问/bind接口时，完整访问路径为http://ip:port(或域名)/rain-user-service/bind");
		return sb.toString();
	}

	@Bean
	public Docket restfulApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rain.cloud.user"))// 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
                .paths(PathSelectors.any())
                .build();
	}
}