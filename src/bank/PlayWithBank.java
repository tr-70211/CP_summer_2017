package bank;

/**
 * Created by Pantho on 2017-04-19.
 */
public class PlayWithBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer cust1 = bank.createCustomer("John", "Smith");
        Customer cust2 = bank.createCustomer("Anne", "Brown");
        Account acc1 = bank.createAccount(cust1, false);
        Account acc2 = bank.createAccount(cust1, true);
        Account acc3 = bank.createAccount(cust2, false);
        Account acc4 = bank.createAccount(cust2, true);

        System.out.println(bank);
    }


}
