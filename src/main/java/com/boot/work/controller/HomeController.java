package com.boot.work.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {
    @GetMapping("/log")
    public ResponseEntity<String> log(){
        log.info("로그 확인");
        return ResponseEntity.ok().body("Hello");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> admin(){
        log.info("admin 요청");
        return ResponseEntity.ok().body("admin");
    }

    @GetMapping("/user/list")
    public ResponseEntity<String> user(){
        log.info("user list 요청");
        return ResponseEntity.ok().body("user List");
    }

    @GetMapping("/user/login")
    public ResponseEntity<String> userLogin(){
        log.info("user login 요청");
        return ResponseEntity.ok().body("user Login");
    }
}
