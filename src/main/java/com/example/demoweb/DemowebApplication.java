
package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class DemowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemowebApplication.class, args);
	}

	@Bean
	CommandLineRunner checkDatabase(DataSource dataSource) {
		return args -> {
			try (Connection connection = dataSource.getConnection()) {

				System.out.println("Database Connected Successfully!");

				System.out.println(
						"Database: " +
								connection.getMetaData().getDatabaseProductName()
				);

				System.out.println(
						"Connection Valid: " + connection.isValid(5)
				);
			}
		};
	}
}
