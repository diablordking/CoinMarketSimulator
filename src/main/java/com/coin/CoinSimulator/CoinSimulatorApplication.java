package com.coin.CoinSimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CoinSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinSimulatorApplication.class, args);
	}
}
