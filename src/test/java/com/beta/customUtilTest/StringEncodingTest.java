package com.beta.customUtilTest;

import com.beta.customUtil.StringEncoding;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class StringEncodingTest {
@Test
    public void testEncoding() throws UnsupportedEncodingException, NoSuchAlgorithmException {
    assertEquals("0fafeaae780954464c1b29f765861fad", StringEncoding.encodeToHex("kbzw9ru"));
}
}
