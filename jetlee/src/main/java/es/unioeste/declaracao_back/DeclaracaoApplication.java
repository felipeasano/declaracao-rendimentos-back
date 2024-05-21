package es.unioeste.declaracao_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(
		basePackages = {"com.example.enderecoback.models","es.unioeste.declaracao_back.models"}
)
@ComponentScan(
		basePackages = {"com.example.enderecoback","es.unioeste.declaracao_back"}
)

@SpringBootApplication
public class DeclaracaoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DeclaracaoApplication.class, args);
	}

}
