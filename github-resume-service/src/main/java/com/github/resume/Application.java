package com.github.resume;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application extends SpringBootServletInitializer {

	public static final String DEFAULT_INCLUDE_PATTERNS = "/resumeAPI/*.*";

	/**
	 * Used when run as JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("githubResume").apiInfo(apiInfo()).select()
				.paths(regex(DEFAULT_INCLUDE_PATTERNS)).build();
	}

	private ApiInfo apiInfo() {
		Contact contact = new Contact("Mustafa Dagher", "",
				"dagher.mustafa@gmail.com");
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("Github Resume")
				.description(
						"A service that creates your resume based on your GitHub repos/activity.")
				.contact(contact).license("MIT")
				.licenseUrl("http://opensource.org/licenses/MIT")
				.version("1.0").build();

		return apiInfo;
	}

	/**
	 * Used when run as WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
}
