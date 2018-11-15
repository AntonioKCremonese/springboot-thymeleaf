package br.com.antonio.apiweb.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"br.com.antonio.*"})
public class ApiwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiwebApplication.class, args);
	}
}
