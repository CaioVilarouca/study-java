package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {
	public static void main (String[] args) {
		Account account = new Account(2004, "Caio", 0.0);
		BusinessAccount accountBusiness = new BusinessAccount(2004, "Caio", 0.0, 500.0);
	}
}
