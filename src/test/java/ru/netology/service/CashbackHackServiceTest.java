package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testOverINeed() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }


}