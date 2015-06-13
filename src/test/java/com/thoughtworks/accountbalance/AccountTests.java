package com.thoughtworks.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);
        account.credit(50);
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(100);
        account.debit(50);
        assertThat(account.getBalance(), is(50));
    }

//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//        Account account = new Account(50);
//        account.debit(100);
//        assertThat(account.getBalance(), is(50));
//    }
}
