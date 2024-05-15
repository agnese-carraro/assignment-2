import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StampaVer1Test {
    @Test
    public void test1() {
        String result = StampaVer1.printAsciiArt("iv");
        assertEquals("" , result);
    }
}
