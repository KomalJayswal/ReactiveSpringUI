package net.learning.ReactiveSwaggerUI;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Telikos-Booking-Service", description = "Booking Service APIs"))
public class ReactiveSwaggerUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSwaggerUiApplication.class, args);
	}

}
