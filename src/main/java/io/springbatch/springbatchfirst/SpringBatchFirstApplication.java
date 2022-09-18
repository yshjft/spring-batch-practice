package io.springbatch.springbatchfirst;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchFirstApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBatchFirstApplication.class, args);
	}
}
