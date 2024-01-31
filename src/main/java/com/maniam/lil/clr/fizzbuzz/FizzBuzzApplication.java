package com.maniam.lil.clr.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class FizzBuzzApplication {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzApplication.class);

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {
			LOG.info("Starting CLR application");
			IntStream.rangeClosed(1, 100).forEach(number -> {
				if (number % 3 == 0 && number % 5 == 0) {
					LOG.info("FizzBuzz");
				} else if (number % 3 == 0) {
					LOG.info("Fizz");
				} else if (number % 5 == 0) {
					LOG.info("Buzz");
				} else {
					LOG.info(String.valueOf(number));
				}
			});
			LOG.info("Finishing CLR application");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

}
