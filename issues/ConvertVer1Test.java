import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConvertVer1Test {
    @Test
    public void NullTest() {
        assertNull(ConvertVer1.conv(-2));
        assertNull(ConvertVer1.conv(0));
        assertNull(ConvertVer1.conv(25));
    }

    @Test
    public void NumbersTest() {
        assertEquals("II", ConvertVer1.conv(2));
        assertEquals("V", ConvertVer1.conv(5));
        assertEquals("VIII", ConvertVer1.conv(8));
    }
}
