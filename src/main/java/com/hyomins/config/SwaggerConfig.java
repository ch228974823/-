package com.hyomins.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: chenjun
 * @Date: 2018/12/6 16:52
 * @Description:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .paths(PathSelectors.regex("/.*"))
                .build();
    }
    private ApiInfo apiInfo(){
        System.out.println(1);
        return new ApiInfoBuilder().title("我的接口文档")
                .contact(new Contact("chenjun","","228974823@qq.com"))
                .description("这是我的接口文档")
                .version("1.1.0.0")
                .build();

    }
}
