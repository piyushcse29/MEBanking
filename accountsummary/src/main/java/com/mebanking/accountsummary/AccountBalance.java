package com.mebanking.accountsummary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountBalance {

	@Id
	@Column(name = "account_id")
	int accountId;
	@Column(name = "customer_id")
	String customerId;
	@Column(name = "account_name")
	String accountName;
	@Column(name = "account_balance")
	int balance;

	public AccountBalance(int accountId, String customerId, String accountName, int balance) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.accountName = accountName;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountBalance [accountId=" + accountId + ", customerId=" + customerId + ", accountName=" + accountName
				+ ", balance=" + balance + "]";
	}

}
