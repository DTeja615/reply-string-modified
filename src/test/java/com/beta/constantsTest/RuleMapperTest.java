package com.beta.constantsTest;

import com.beta.constants.RuleMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RuleMapperTest {

    @Test
    public void simpleMapperTest() throws ClassNotFoundException {
        assertNotNull(RuleMapper.getRuleMapper().get('1'));
        assertNotNull(RuleMapper.getRuleMapper().get('2'));
    }

    @Test
    public void simpleMapperTestNegative() throws ClassNotFoundException {
        assertNull(RuleMapper.getRuleMapper().get('3'));
    }
}
