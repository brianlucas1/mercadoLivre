package br.com.mutante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MutanteApplication {

	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MutanteApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(MutanteApplication.class, args);
	}

	
	
}
