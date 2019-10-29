package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;

import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void moveTestWhenFree() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.E3));
        logic.add(new KingBlack(Cell.F4));
        boolean isFree = logic.move(Cell.E3, Cell.B6);
        assertTrue(isFree);
    }

     @Test
    public void moveTestWhenBlocked() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.E3));
        logic.add(new KingBlack(Cell.F4));
        boolean isBlocked = logic.move(Cell.E3, Cell.H6);
        assertFalse(isBlocked);
    }
}