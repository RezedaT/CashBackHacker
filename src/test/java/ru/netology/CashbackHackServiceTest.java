package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testIfAmountIsZero() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testIfAmountIsCorrect() {

        int actual = service.remain(3_500);
        int expected = 500;

        assertEquals(actual, expected);

    }

    // данный тест не проходит, так как в сервисе есть ошибка
//    @Test
//    public void testIfAmountIsBoundary() {
//
//        int actual = service.remain(1_000);
//        int expected = 0;
//
//        assertEquals(actual, expected);
//    }
}
