package com.beta.constants;

import java.util.HashMap;
import java.util.Map;

public final class RuleMapper {
    //Can be a configured in xml,excel or database for simplicity have used a class
    private static Map<Character,Class> ruleMapper = new HashMap<Character, Class>();

    static {
        try {
            ruleMapper.put('1',Class.forName("com.beta.customUtil.StringReverse"));
            ruleMapper.put('2',Class.forName("com.beta.customUtil.StringEncoding"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Map<Character, Class> getRuleMapper() {
        return ruleMapper;
    }
}
