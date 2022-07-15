package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 1000;
        int result = service.remain(amount);

        assertEquals(result, expected);

    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int result = service.remain(amount);

        assertEquals(result, expected);

    }
    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 800;
        int amount = 1200;
        int result = service.remain(amount);

        assertEquals(result, expected);

    }
    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int expected = 2000;
        int amount = 2000;
        int result = service.remain(amount);

        assertEquals(result, expected);

    }
    @Test
    public void testRemain5() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;
        int result = service.remain(amount);

        assertEquals(result, expected);

    }
}