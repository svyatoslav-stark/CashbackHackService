package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainZeroAmount() {
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(expected, actual);
}

    @Test
    public void testRemainExactBoundary() {
        int actual = service.remain(1000);
        int expected = 0; // Ошибка в сервисе: должно быть 0, а не 1000
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainBelowBoundary() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainAboveBoundary() {
        int actual = service.remain(1200);
        int expected = 800;
        Assert.assertEquals(expected, actual);
    }
}