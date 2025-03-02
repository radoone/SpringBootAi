package ibm.com.demo.springbootai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple Hello World controller
 * Demonstrates basic REST API functionality
 */
@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World! Welcome to the AI-Powered Spring Boot Workshop!";
    }
}