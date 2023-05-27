package com.hyun2.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(title = "사용자 정보") // Swagger-ui
public class MemberDto {

    @NotBlank // Swagger-ui
    @Schema(title = "사용자 이름", example = "Jahyun Ku") // Swagger-ui
    private String name;
    @Schema(title = "사용자 이메일", example = "g88080997@gmail.com") // Swagger-ui
    private String email;
    @Schema(title = "사용자 소속", example = "DGSW") // Swagger-ui
    private String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }

}
