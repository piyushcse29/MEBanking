package com.mebanking.accountsummary;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountSummaryRepository extends MongoRepository<AccountBalance, String> {

	public AccountBalance findByAccountId(String accountId);

	public List<AccountBalance> findByCustomerId(String customerId);

}
