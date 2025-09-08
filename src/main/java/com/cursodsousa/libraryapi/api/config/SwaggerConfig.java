package com.cursodsousa.libraryapi.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;*/
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI defineOpenApi() {
        Contact myContact = new Contact();
        myContact.setName("Dougllas Sousa");
        myContact.setUrl("http://github.com/dougllasfps");
        myContact.setEmail("cursodsousa@gmail.com");

        Info information = new Info()
                .title("Library API")
                .version("1.0")
                .description("API do Projeto de controle de aluguel de livros")
                .contact(myContact);

        return new OpenAPI().info(information);
    }

    /*@Bean
    public GroupedOpenApi v2Api() {
        return GroupedOpenApi.builder()
                .group("v2")
                .pathsToMatch("/api/v2/**")
                .build();
    }*/

    /*@Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cursodsousa.libraryapi.api.resource"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Library API")
                .description("API do Projeto de controle de aluguel de livros")
                .version("1.0")
                .contact(contact())
                .build();
    }

    private Contact contact() {
        return new Contact("Dougllas Sousa",
                "http://github.com/dougllasfps",
                "cursodsousa@gmail.com");
    }*/

}
