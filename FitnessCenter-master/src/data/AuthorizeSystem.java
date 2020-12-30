package data;

import java.util.List;

public class AuthorizeSystem {

	private List<Account> accountList;
	private Account account;
	
	public Account authorize(String login, String password) {
		return account;
	}
	
	public void setAccount(Account acc) {
		account = acc;
	}
	
	public Account getAccount() {
		return account;
	}
}
