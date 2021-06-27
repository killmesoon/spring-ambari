package org.inspur.insight;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "org.inspur.insight.server")
public class InsightApplication {
    public static void main(String[] args) {
        SpringApplication.run(InsightApplication.class, args);
    }
}
