package com.example.skywalkingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SkywalkingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkywalkingTestApplication.class, args);
    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("hello/{id}")
    public String hello(@PathVariable Integer id) throws Exception {
        if (id % 2 == 0) {
            try {
                List list=new ArrayList();
                for (int i = 0; i < 1000; i++) {
                    list.add(i);
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (id % 3 == 0) {
            throw new Exception("cc");
        }
        return "hello" + id;
    }
}
