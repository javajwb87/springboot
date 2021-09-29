package com.source.library.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CompletableFuture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API documentation 설정
 * @author Changgyun
 *
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.nit.order_library.rest.controller"))
                .build().apiInfo(apiInfo())
                // Response에 CompletableFuture가 나타나는 것 없애기
                .genericModelSubstitutes(CompletableFuture.class)
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")))
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Order API").description("NiceOrder Test API").version("0.0.1")
                .license("GPL").build();
    }

}
