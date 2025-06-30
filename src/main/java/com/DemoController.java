package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
  public String helloWorld() {
    return "Hello World";
  }
}
