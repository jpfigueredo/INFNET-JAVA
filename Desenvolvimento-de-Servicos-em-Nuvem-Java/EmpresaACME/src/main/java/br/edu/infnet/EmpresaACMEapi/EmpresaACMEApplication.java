package br.edu.infnet.EmpresaACMEapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EmpresaACMEApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpresaACMEApplication.class, args);
    }
}
