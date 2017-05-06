package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pantho on 2017-04-19.
 */
public class Bank {

    List<Customer> customerList = new ArrayList<>();
    List<Account> accountList = new ArrayList<>();
    Long lastCustomerId = 0L;
    Long lastAcountId = 0L;

    public Customer createCustomer(
            String firstName, String lastName) {
        Long myNewId = lastCustomerId++;
        Customer cu = new Customer(myNewId, firstName, lastName);
        customerList.add(cu);
        return cu;

    }

    public Account createAccount (Customer cust,
                                  boolean isSavings) {
        Long myNewId = lastAcountId++;
        Account acc = isSavings ?
                new SavingsAccount (myNewId, cust)
                :
                new DebitAccount (myNewId, cust);

        accountList.add(acc);
        return acc;
    }

    @Override
    public String toString() {
        return "Bank\n{" +
                "customer=" + customerList +
                "\n, account=" + accountList +
                "\n, lastCustomerId=" + lastCustomerId +
                ", lastAcountId=" + lastAcountId +
                '}';
    }
}
