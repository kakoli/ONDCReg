package org.ondcreg.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@EntityScan(basePackages = "org.ondcreg.search.*")
/* SpringBootServletInitializer implements the WebApplicationInitializer interface, which is new in Servlet 3.0+
 Implementation of this interface will automatically configure the ServletContext and communicate with the
 Servlet Container
 */
public class RegistryDemoApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RegistryDemoApp.class, args);
        System.out.println("Started Springboot Server for ONDC Registry Demo");
    }
}
