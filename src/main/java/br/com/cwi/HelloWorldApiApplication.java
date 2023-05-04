package br.com.cwi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApiApplication.class, args);
    }

    @GetMapping("/")
    public String olaCwi() {
        return "Olá, cwisers!";
    }

    @GetMapping("/en")
    public String hello() {
        return "Hello World!";
    }
}
