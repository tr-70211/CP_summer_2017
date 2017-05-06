package bank;

/**
 * Created by Pantho on 2017-04-19.
 */
public class DebitAccount extends Account {
    public DebitAccount(Long accountID, Customer customer, String currency) {
        super(accountID, customer, currency);
    }
}
