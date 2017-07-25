package tr.org.linux.kamp.account;

public class AccountApplication {

	public static void main(String[] args) {
		Account myAccount = new Account("Jan Curtis", 500);

		Account MyAccount2 = new Account("Yavuz Çetin", 300);

		Account MyAccount3 = new Account("Jim Marrison");

		MyAccount3.deposit(3000);
		
		System.out.println(MyAccount3.getBalance());

		myAccount.setName("Kerim Çaplı");

		System.out.println(myAccount.getName());

		System.out.println(MyAccount2.getName());
	}

}
