package com.beta.replyservice;

import com.beta.constants.Constants;
import com.beta.customUtil.InputValidatorAndParser;
import com.beta.model.V2ReplyModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputValidateAndParseTest {

    @Test
    public void testValidFormat(){
        InputValidatorAndParser.isValidFormat("11-abcd");
    }

    @Test
    public void testInValidFormat(){
        try{
            InputValidatorAndParser.isValidFormat("11abcd");
        } catch (IllegalArgumentException e) {
            assertEquals("Does not contain -",e.getMessage());
        }
    }

    @Test
    public void testMoreThanOneSplit(){
        try{
            InputValidatorAndParser.isValidFormat("111-abc-d");
        }catch (IllegalArgumentException e) {
            assertEquals("More than one -",e.getMessage());
        }

    }

    @Test
    public void testInvalidRuleLength(){
        try {
            InputValidatorAndParser.isValidFormat("111-abcd");
        }catch (IllegalArgumentException e) {
            assertEquals("Rules contain more than two numbers",e.getMessage());
        }
    }

    @Test
    public void testInValidRuleNumber(){
     try {
         InputValidatorAndParser.isValidFormat("13-abcd");
     }catch (IllegalArgumentException e) {
         assertEquals("Invalid input",e.getMessage());
     }
    }

    @Test
    public void testValidSingleRuleNumber(){
        InputValidatorAndParser.isValidFormat("1-abcd");
    }

    @Test
    public void testModelPopulation(){
        V2ReplyModel v2ReplyModel = InputValidatorAndParser.prepareInputModel("21-abcd");
        char[] expectedRuleArray = {'1'};
        assertEquals('2',v2ReplyModel.getInputRuleArray()[0]);
        assertEquals('1',v2ReplyModel.getInputRuleArray()[1]);
        assertEquals("abcd",v2ReplyModel.getInputString());
    }
}
