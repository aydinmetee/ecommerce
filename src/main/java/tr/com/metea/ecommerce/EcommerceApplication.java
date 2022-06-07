package tr.com.metea.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class EcommerceApplication {

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("Turkey"));
    }

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

}
