
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

		Account account = new Account("Arto's account", 100.00);
		account.deposit(20);
		System.out.println(account);
    }
}
