package cn.cuit.web.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket docket(Environment environment){
        Profiles profiles= Profiles.of("dev","test");
        boolean flag=environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("红烧肉热馒头")
                .apiInfo(this.apiInfo())
                .enable(flag) //开发环境和测试环境下打开
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public ApiInfo apiInfo(){
        Contact contact=new Contact("红烧肉热馒头","http://localhost:8080/","1356772315@qq.com");
        return new ApiInfo("宝龙航空机票预订系统",
                "SpringBoot项目",
                "v0.0.3",
                "http://localhost:8080/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}
