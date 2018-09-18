package com.mebanking.accountsummary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RibbonClient(name = "account-summary-service")
public class AccountSummaryController {

	@Autowired
	private AccountSummaryRepository accountSummaryRepository;

	@GetMapping("/accountbalance")
	List<AccountBalance> getBalances() {
		return accountSummaryRepository.findAll();
	}
}
