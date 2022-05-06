package cn.tedu.gate.beijing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class GateBeijingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateBeijingApplication.class, args);
    }

}
