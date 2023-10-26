package product_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.boot.builder.SpringApplicationBuilder;
@SpringBootApplication
public class SpringBootCrudRestApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootCrudRestApplication.class);
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootCrudRestApplication.class, args);
    }


}
