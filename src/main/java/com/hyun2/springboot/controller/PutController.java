package com.hyun2.springboot.controller;
import com.hyun2.springboot.dto.MemberDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
@Tag(name = "04.Test") // Swagger-ui
public class PutController {

    @PutMapping(value = "/member")
    @Operation(summary = "PUT연습", description = "API - PUT 연습입니다.", tags = {"04.Test", }) // Swagger-ui
    public String putMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping(value = "/member1")
    public String putMemberDto1(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    @PutMapping(value = "/member2")
    public MemberDto putMemberDto2(@RequestBody MemberDto memberDto) {
        return memberDto;
    }

    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDto> putMemberDto3(@RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDto);
    }

}
