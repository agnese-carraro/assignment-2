import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StampaVer2Test {
    @Test
    public void NullTest() {
        assertNull(StampaVer2.print(-8));
        assertNull(StampaVer2.print(0));
        assertNull(StampaVer2.print(173));
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
                """, StampaVer2.print(3));
        assertEquals("""
                 _____  __      __\s
                |_   _| \\ \\    / /\s
                  | |    \\ \\  / / \s
                  | |     \\ \\/ /  \s
                 _| |_     \\  /   \s
                |_____|     \\/    \s
                """, StampaVer2.print(4));
        assertEquals("""
                 __      __  _____  _____\s
                 \\ \\    / / |_   _||_   _|
                  \\ \\  / /    | |    | | \s
                   \\ \\/ /     | |    | | \s
                    \\  /     _| |_  _| |_\s
                     \\/     |_____||_____|
                """, StampaVer2.print(7));
        assertEquals("""
                 _____  __   __\s
                |_   _| \\ \\ / /\s
                  | |    \\ V / \s
                  | |     > <  \s
                 _| |_   / . \\ \s
                |_____| /_/ \\_\\\s
                """, StampaVer2.print(9));
        assertEquals("""
                 __   __  __   __  __      __  _____  _____  _____\s
                 \\ \\ / /  \\ \\ / /  \\ \\    / / |_   _||_   _||_   _|
                  \\ V /    \\ V /    \\ \\  / /    | |    | |    | | \s
                   > <      > <      \\ \\/ /     | |    | |    | | \s
                  / . \\    / . \\      \\  /     _| |_  _| |_  _| |_\s
                 /_/ \\_\\  /_/ \\_\\      \\/     |_____||_____||_____|
                """, StampaVer2.print(28));
        assertEquals("""
                 __   __  __   __  __   __  _____  __   __\s
                 \\ \\ / /  \\ \\ / /  \\ \\ / / |_   _| \\ \\ / /\s
                  \\ V /    \\ V /    \\ V /    | |    \\ V / \s
                   > <      > <      > <     | |     > <  \s
                  / . \\    / . \\    / . \\   _| |_   / . \\ \s
                 /_/ \\_\\  /_/ \\_\\  /_/ \\_\\ |_____| /_/ \\_\\\s
                """, StampaVer2.print(39));
        assertEquals("""
                  _       _____\s
                 | |     |_   _|
                 | |       | | \s
                 | |       | | \s
                 | |____  _| |_\s
                 |______||_____|
                """, StampaVer2.print(51));
        assertEquals("""
                  _       __   __  __   __  _____  _____  _____\s
                 | |      \\ \\ / /  \\ \\ / / |_   _||_   _||_   _|
                 | |       \\ V /    \\ V /    | |    | |    | | \s
                 | |        > <      > <     | |    | |    | | \s
                 | |____   / . \\    / . \\   _| |_  _| |_  _| |_\s
                 |______| /_/ \\_\\  /_/ \\_\\ |_____||_____||_____|
                """, StampaVer2.print(73));
        assertEquals("""
                 __   __    _____  _____  __   __\s
                 \\ \\ / /   / ____||_   _| \\ \\ / /\s
                  \\ V /   | |       | |    \\ V / \s
                   > <    | |       | |     > <  \s
                  / . \\   | |____  _| |_   / . \\ \s
                 /_/ \\_\\   \\_____||_____| /_/ \\_\\\s
                """, StampaVer2.print(99));
    }
}



