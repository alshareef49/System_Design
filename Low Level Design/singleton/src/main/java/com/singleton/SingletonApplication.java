package com.singleton;

import com.singleton.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication implements CommandLineRunner {

	@Autowired
	SingletonService singletonService;

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getAllProducts();
		addProduct();
	}

	private void addProduct() {
		
	}

	private void getAllProducts() {
	}
}
