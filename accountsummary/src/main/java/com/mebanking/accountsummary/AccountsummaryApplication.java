package com.mebanking.accountsummary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountsummaryApplication implements CommandLineRunner {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(AccountsummaryApplication.class, args);
	}

	@Autowired
	private AccountSummaryRepository accountSummaryRepository;

	@Override
	public void run(String... args) throws Exception {

		accountSummaryRepository.save(new AccountBalance(12345, "piyushcse29", "Piyush Mittal", 11111.1f));

		for (final AccountBalance accBal : accountSummaryRepository.findAll()) {
			logger.info("The account balance is " + accBal.toString());
		}
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
