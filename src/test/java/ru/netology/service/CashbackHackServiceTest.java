package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain_ZeroAmount() {
        int actual = service.remain(0);

        int expected = 1000;
        Assert.assertEquals(actual, expected, "При нулевой сумме остаток должен составлять 1000");
    }

    @Test
    public void testRemain_ExactBoundary() {
        int actual = service.remain(1000);

        int expected = 1000;
        Assert.assertEquals(actual, expected, "Для получения точной границы остаток должен составлять 1000");
    }

    @Test
    public void testRemain_BelowBoundary() {
        int actual = service.remain(900);

        int expected = 100;
        Assert.assertEquals(actual, expected, "Для суммы ниже установленной границы остаток должен составлять 100");
    }

    @Test
    public void testRemain_AboveBoundary() {

        int actual = service.remain(1200);

        int expected = 800;
        Assert.assertEquals(actual, expected, "Для суммы, превышающей границу, остаток должен составлять 800");
    }
}