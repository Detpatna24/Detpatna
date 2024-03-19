package cms.com.det;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "cms.com.det")
@SpringBootApplication
public class DetRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetRegistrationApplication.class, args);
	}

}
