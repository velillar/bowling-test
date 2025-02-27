import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

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
}
