package com.mypackage.banking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mypackage.banking.model.Account;

public class AccountService {
	
	Map<Integer, Account> accounts = new HashMap<>();
	
	public AccountService(){
		
		Account acc1 = new Account(1, "Koushik", "Saving", true);
		
		accounts.put(acc1.getId(), acc1);
		
	}
	
	public List<Account> getAccounts(){
		return new ArrayList<>(accounts.values());
	}
	
	public Account getAccount( int id){
		return accounts.get(id);
	}
	
	public int createAccount (Account account){		
		int accountId = accounts.size() + 1;
		accounts.put(accountId ,  account);
		return accountId;
	}

}
