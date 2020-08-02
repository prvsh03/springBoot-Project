package com.basic.StudentTable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("module-service")
public class StudentTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentTableApplication.class, args);
	}

}
