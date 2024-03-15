package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.service.CustomService;

@SpringBootApplication
public class SpringJdbcCustomIDsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcCustomIDsApplication.class, args);
		CustomService bean = context.getBean(CustomService.class);
		bean.studentSave();
	}

}
