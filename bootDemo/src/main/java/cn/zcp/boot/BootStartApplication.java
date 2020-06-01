package cn.zcp.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.zcp.boot.mapper")
public class BootStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootStartApplication.class);
    }
}
