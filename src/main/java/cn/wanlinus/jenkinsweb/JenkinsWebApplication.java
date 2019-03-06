package cn.wanlinus.jenkinsweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class JenkinsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsWebApplication.class, args);
    }

    @GetMapping
    public String index() {
        return "This is a test page, Congratulations";
    }

}
