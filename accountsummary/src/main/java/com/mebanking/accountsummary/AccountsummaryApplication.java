package com.mebanking.accountsummary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountsummaryApplication implements CommandLineRunner {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(AccountsummaryApplication.class, args);
	}

	@Autowired
	private AccountSummaryRepository accountSummaryRepository;

	@Override
	public void run(String... args) throws Exception {

		accountSummaryRepository.save(new AccountBalance(12345, "piyushcse29", "Piyush Mittal", 11111));

		for (final AccountBalance accBal : accountSummaryRepository.findAll()) {
			logger.info("The account balance is " + accBal.toString());
		}
	}

}
