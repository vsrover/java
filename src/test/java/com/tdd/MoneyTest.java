package com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.frank(5).equals(Money.dollar(5)));
    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.augend);
    }

    @Test
    public void testReduceSum(){
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney(){
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.frank(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testIdentityRate(){
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void testMixedAddition(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrank = Money.frank(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrank), "USD");
        assertEquals(Money.dollar(10), result);
    }

    @Test
    public void testSumPlusMoney(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrank = Money.frank(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression result = new Sum(fiveBucks, tenFrank).plus(fiveBucks);
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrank = Money.frank(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFrank).times(2);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testPlusSameCurrencyReturnMoney(){
        Expression sum = Money.dollar(1).plus(Money.dollar(1));
        assertTrue(sum instanceof Money);
    }
}