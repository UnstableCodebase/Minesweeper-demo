package no.kristiania.minesweeper;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MinefieldTest {
    @Test
    public void isShowsEmptyMinefield() {
        assertArrayEquals(new String[] {"000","000"}, displayMinefield(new String [] {"...","..."}));
    }
    private String [] displayMinefield(String[] input) {
        return new String[0];
    }


}
