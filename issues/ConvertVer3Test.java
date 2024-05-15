import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConvertVer3Test {
    @Test
    public void NullTest() {
        assertNull(ConvertVer3.conv(-2));
        assertNull(ConvertVer3.conv(0));
        assertNull(ConvertVer3.conv(1000));
        assertNull(ConvertVer3.conv(1563));
    }

    @Test
    public void NumbersTest() {
        assertEquals("II", ConvertVer3.conv(2));
        assertEquals("V", ConvertVer3.conv(5));
        assertEquals("VIII", ConvertVer3.conv(8));
        assertEquals("XI", ConvertVer3.conv(11));
        assertEquals("XXXVI", ConvertVer3.conv(36));
        assertEquals("LVII", ConvertVer3.conv(57));
        assertEquals("LXII", ConvertVer3.conv(62));
        assertEquals("LXXIX", ConvertVer3.conv(79));
        assertEquals("LXXXV", ConvertVer3.conv(85));
        assertEquals("XCIX", ConvertVer3.conv(99));
        assertEquals("CLXIII", ConvertVer3.conv(163));
        assertEquals("CCCLXIX", ConvertVer3.conv(369));
        assertEquals("CDXLVII", ConvertVer3.conv(447));
        assertEquals("DCXXIX", ConvertVer3.conv(629));
        assertEquals("DCCLXXXIX", ConvertVer3.conv(789));
        assertEquals("DCCCXCIX", ConvertVer3.conv(899));
        assertEquals("CMXCVIII", ConvertVer3.conv(998));
    }
}
