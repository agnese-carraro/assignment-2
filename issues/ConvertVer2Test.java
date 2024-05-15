import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConvertVer2Test {
    @Test
    public void NullTest() {
        assertNull(ConvertVer2.conv(-2));
        assertNull(ConvertVer2.conv(0));
        assertNull(ConvertVer2.conv(173));
    }

    @Test
    public void NumbersTest() {
        assertEquals("II", ConvertVer2.conv(2));
        assertEquals("V", ConvertVer2.conv(5));
        assertEquals("VIII", ConvertVer2.conv(8));
        assertEquals("XI", ConvertVer2.conv(11));
        assertEquals("XXXVI", ConvertVer2.conv(36));
        assertEquals("LVII", ConvertVer2.conv(57));
        assertEquals("LXII", ConvertVer2.conv(62));
        assertEquals("LXXIX", ConvertVer2.conv(79));
        assertEquals("LXXXV", ConvertVer2.conv(85));
        assertEquals("XCIX", ConvertVer2.conv(99));
    }
}
