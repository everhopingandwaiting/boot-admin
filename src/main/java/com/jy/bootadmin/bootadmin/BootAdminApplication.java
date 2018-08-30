package com.jy.bootadmin.bootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class BootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class, args);
    }
}
