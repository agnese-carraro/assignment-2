import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConvertVer4Test {
    @Test
    public void NullTest() {
        assertNull(ConvertVer4.conv(-2));
        assertNull(ConvertVer4.conv(0));
        assertNull(ConvertVer4.conv(1563));
    }

    @Test
    public void NumbersTest() {
        assertEquals("II", ConvertVer4.conv(2));
        assertEquals("V", ConvertVer4.conv(5));
        assertEquals("VIII", ConvertVer4.conv(8));
        assertEquals("XI", ConvertVer4.conv(11));
        assertEquals("XXXVI", ConvertVer4.conv(36));
        assertEquals("LVII", ConvertVer4.conv(57));
        assertEquals("LXII", ConvertVer4.conv(62));
        assertEquals("LXXIX", ConvertVer4.conv(79));
        assertEquals("LXXXV", ConvertVer4.conv(85));
        assertEquals("XCIX", ConvertVer4.conv(99));
        assertEquals("CLXIII", ConvertVer4.conv(163));
        assertEquals("CCCLXIX", ConvertVer4.conv(369));
        assertEquals("CDXLVII", ConvertVer4.conv(447));
        assertEquals("DCXXIX", ConvertVer4.conv(629));
        assertEquals("DCCLXXXIX", ConvertVer4.conv(789));
        assertEquals("DCCCXCIX", ConvertVer4.conv(899));
        assertEquals("CMXCVIII", ConvertVer4.conv(998));
        assertEquals("M", ConvertVer4.conv(1000));
    }
}
