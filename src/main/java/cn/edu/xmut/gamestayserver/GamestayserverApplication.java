package cn.edu.xmut.gamestayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@tk.mybatis.spring.annotation.MapperScan(basePackages = "cn.edu.xmut.gamestayserver.dao")
public class GamestayserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamestayserverApplication.class, args);
    }

}
