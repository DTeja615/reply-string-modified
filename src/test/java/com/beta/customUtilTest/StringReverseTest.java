package com.beta.customUtilTest;

import com.beta.customUtil.StringReverse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {

    @Test
    public void testStringReverse(){
        assertEquals("ih",StringReverse.reverseString("hi"));
    }
}
