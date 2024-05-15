import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StampaVer2Test {
    public void NullTest() {
        assertNull(StampaVer1.print(-8));
        assertNull(StampaVer1.print(0));
        assertNull(StampaVer1.print(19));
    }
    @Test
    public void NumbersTest() {
        assertEquals("""
                 _____  _____  _____\s
                |_   _||_   _||_   _|
                  | |    | |    | | \s
                  | |    | |    | | \s
                 _| |_  _| |_  _| |_\s
                |_____||_____||_____|
                """, StampaVer1.print(3));
        assertEquals("""
                 _____  __      __\s
                |_   _| \\ \\    / /\s
                  | |    \\ \\  / / \s
                  | |     \\ \\/ /  \s
                 _| |_     \\  /   \s
                |_____|     \\/    \s
                """,
                StampaVer1.print(4));
        assertEquals("""
                 __      __  _____  _____\s
                 \\ \\    / / |_   _||_   _|
                  \\ \\  / /    | |    | | \s
                   \\ \\/ /     | |    | | \s
                    \\  /     _| |_  _| |_\s
                     \\/     |_____||_____|
                """, StampaVer1.print(7));
        assertEquals("""
                 _____  __   __\s
                |_   _| \\ \\ / /\s
                  | |    \\ V / \s
                  | |     > <  \s
                 _| |_   / . \\ \s
                |_____| /_/ \\_\\\s
                """, StampaVer1.print(9));
        assertEquals("""
                """, StampaVer1.print(28));
        assertEquals("""
                """, StampaVer1.print(39));
        assertEquals("""
                """, StampaVer1.print(51));
        assertEquals("""
                """, StampaVer1.print(73));
        assertEquals("""
                """, StampaVer1.print(99));
    }
    }


}
