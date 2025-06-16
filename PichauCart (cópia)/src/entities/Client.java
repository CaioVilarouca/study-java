package entities;

import java.util.Date;

public class Client {
	private String name;
	private String e_mail;
	private Date nasc;
	
	public Client () {
		
	}

	public Client(String name, String e_mail, Date nasc) {
		this.name = name;
		this.e_mail = e_mail;
		this.nasc = nasc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public Date getNasc() {
		return nasc;
	}

	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}

	@Override
	public String toString() {
		return "Nome: " + name + ", E_Mail " + e_mail;
	}
}
