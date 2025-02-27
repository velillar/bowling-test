package com.kroger.bowling.rickvelilla;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import com.kroger.bowling.rickvelilla.Bowling;

public class BowlingTest {
    @Test
    public void testCalculateScore() {
        String[] frames = new String[] {"0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2","1,1"};
        assertEquals(60, Bowling.calculateScore(frames));
    }

    @Test
    public void testCalculateScoreWithInvalidInput() {
        String[] frames = new String[] {"0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2"};
        assertThrows(IllegalArgumentException.class, () -> {
            Bowling.calculateScore(frames);
        });
    }

    @Test
    public void testInvalidNumberOfFrames() {
        String[] frames = new String[] {"0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2"};
        assertThrows(IllegalArgumentException.class, () -> {
            Bowling.calculateScore(frames);
        });
    }

    @Test
    public void testInvalidFrameLength() {
        String[] frames = new String[] {"0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2","1"};
        assertThrows(IllegalArgumentException.class, () -> {
            Bowling.calculateScore(frames);
        });
    }

    @Test
    public void testInvalidValueInFrame() {
        String[] frames = new String[] {"0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2","1,A"};
        assertThrows(IllegalArgumentException.class, () -> {
            Bowling.calculateScore(frames);
        });
    }

    @Test
    public void testValidTenthFrameWithThreeValues() {
        String[] frames = new String[] {"0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2","1,1,1"};
        assertEquals(60, Bowling.calculateScore(frames));
    }

    @Test
    public void testSumOfNumbersDoesNotExceedNine() {
        String[] frames = new String[] {"0,4","X","3,2","4,5","1,0","4,4","X","0,0","4,2","5,5"};
        assertThrows(IllegalArgumentException.class, () -> {
            Bowling.calculateScore(frames);
        });
    }
}
