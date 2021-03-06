package com.abc.account;

/**
 * Created by Vidushi Bhandari on 3/23/2015.
 */
public class SavingsAccount extends Account {

    public SavingsAccount(long accountId) {
        super(accountId);
        this.accountType = AccountType.SAVINGS;
    }

    /*
    ** interest accrued daily - compounding is out of scope for this exercise
    */

    public double interestEarned() {
        double amount = currentBalance.getDoubleValue();

        if (amount <= 1000)
            return (amount * 0.001)/365.0;
        else
            return (1 + (amount-1000) * 0.002)/365.0;
    }

}
