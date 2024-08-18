package me.dio.springWebApi.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2

public class SwaggerConfig {

    private Contact contato() {
        return new Contact(
                "Seu nome",
                "http://www.seusite.com.br",
                "voce@seusite.com.br");
    }

    private ApiInfoBuilder informacoesApi() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Título - Rest API"); // Define o título da API
        apiInfoBuilder.description("API exemplo de uso de Springboot REST - Rest API"); // Descrição da API
        apiInfoBuilder.version("1.0"); // Versão da API
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source"); // Link para os termos de uso
        apiInfoBuilder.license("Licença - Sua Empresa"); // Nome da licença
        apiInfoBuilder.licenseUrl("http://www.seusite.com.br"); // Link para a licença
        apiInfoBuilder.contact(this.contato()); // Define as informações de contato (definidas em outro lugar)

        return apiInfoBuilder; // Retorna o objeto com as informações da API

    }

    @Bean
    public Docket detalheApi() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("me.dio.springWebApi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }


}