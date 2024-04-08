package br.com.managementhomenew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.properties")
public class NewHomeManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewHomeManagementAppApplication.class, args);
	}

}
