package om.springwebflux.bootcamp.service.person.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringwebfluxBootcampServiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxBootcampServiceConfigServerApplication.class, args);
	}

}
