package com.hyun2.springboot.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Spring Doc API Document",
                description = "API Document",
                version = "v1.0.0",
                license = @License(
                        name = "Apache License Version 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0"
                ),
                contact = @Contact(
                        name = "Jahyun Ku",
                        email = "g88080997@gmail.com"
                )
        ),
        tags = {
                @Tag(name = "01.Common", description = "공통 기능"),
                @Tag(name = "02.User", description = "사용자 기능"),
                @Tag(name = "03.Undefined", description = "미정의 기능"),
                @Tag(name = "04.Test", description = "테스트 태그")
        }
)
@Configuration
public class SpringDocConfig {
}
