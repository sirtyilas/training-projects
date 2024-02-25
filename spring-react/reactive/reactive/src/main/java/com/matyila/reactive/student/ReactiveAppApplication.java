package com.matyila.reactive;

import com.matyila.reactive.student.Student;
import com.matyila.reactive.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentService studentService){

		System.out.println("Starting ti create data");
		return args -> {
			for(int n = 0 ; n < 100; n++){
				studentService.save(Student.builder()
						.firstName("Luba " + n)
						.lastName("Mat " + n)
						.age(38)
						.build()).subscribe();
			}

		};
	}

}
