package com.vehiclesale.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {

    private final String devUrl = "http://localhost:8080";

    private final String prodUrl = "vehiclesales.com";

    @Bean
    public OpenAPI openApi() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server url for development environment");

        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Server url for production environment");

        Contact contact = new Contact();
        contact.setEmail("patrick.fouotsop@facsciences-uy1.cm");
        contact.setName("Patrick Fouotsop");
        contact.setUrl("https://fouotsop.github.io/portfolio");

        License mitLicense = new License().name("MIT License").url("https://opensource.org/licenses/MIT");
        Info info = new Info()
                .title("Online Vehicle Sale Backend application")
                .description("This is a simple backend application for an online vehicle sale platform. It is built with Spring Boot and Java. It provides a REST API for managing vehicles and clients commands.")
                .version("1.0.0")
                .contact(contact)
                .license(mitLicense);

        return new OpenAPI().info(info)
                .addServersItem(devServer)
                .addServersItem(prodServer);
    }

}
