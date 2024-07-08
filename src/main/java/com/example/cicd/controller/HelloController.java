package com.example.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName : com.example.cicd.controller
 * @FileName : HelloController
 * @Author : noglass_gongdae
 * @Date : 2024-06-02
 * @Blog : https://blog.naver.com/noglass_gongdae
 * @GitHub :
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("안녕하세요. 반갑습니다.");
    }

}
