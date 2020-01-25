package ru.ladonov.springcrud;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcOperationsDependsOnPostProcessor;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringcrudApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringcrudApplication.class, args);
	}

}
