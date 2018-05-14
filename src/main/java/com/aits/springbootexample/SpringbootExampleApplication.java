package com.aits.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootExampleApplication implements CommandLineRunner {

	@Autowired
	private NoteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save( new Note("test note1", "this is note1 body text") );

		// fetch all customers
		System.out.println("Notes found with findAll():");
		System.out.println("-------------------------------");
		for (Note note : repository.findAll()) {
			System.out.println(note);
		}
		System.out.println();

//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}

	}

}
