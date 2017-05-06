package bank;

import java.math.BigDecimal;

/**
 * Created by Pantho on 2017-04-19.
 */
public class Account {
    //this is to be an abstract class. the idea is to have a savings account and a deposit account
    private Long accountID;
    private Customer customer; //the account will hold a reference to customer
    private BigDecimal balance;
    private String currency;


    public Account(Long accountId, Customer customer, String currency) {
        this.accountID = accountId;
        this.customer = customer;
        this.balance = new BigDecimal(0);
        this.currency = currency;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "\n" + this.getClass().getSimpleName()
                .replace("Account", "") + "{" +
                "id=" + accountID +
                ", cust=" + customer.getCustomerId() +
                ", " + currency + " " + balance +
                '}';
    }

}
