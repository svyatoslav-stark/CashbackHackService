package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJupiterTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void testRemain_ZeroAmount() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    void testRemain_ExactBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testRemain_BelowBoundary() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void testRemain_AboveBoundary() {
        int actual = service.remain(1200);
        int expected = 800;
        assertEquals(expected, actual);
    }
}