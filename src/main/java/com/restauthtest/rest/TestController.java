package com.restauthtest.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@ResponseBody
public class TestController {

  @GetMapping("/ping")
  public ResponseEntity<Object> ping() {
    return ResponseEntity.status(HttpStatus.OK).body("UP");
  }

  @GetMapping("/hello")
  public ResponseEntity<Object> hello() {
    return ResponseEntity.status(HttpStatus.OK).body("Authenticated");
  }
}
