package com.beta.customUtil;

import com.beta.constants.Constants;
import com.beta.model.V2ReplyModel;

import java.util.Arrays;

public final class InputValidatorAndParser {


    public static void isValidFormat(String s) throws IllegalArgumentException{

        if(!s.contains("-")) throw  new IllegalArgumentException("Does not contain -");

        if(s.split("-").length > Constants.NUMBER_OF_RULES) throw  new IllegalArgumentException("More than one -");

        if(s.split("-",2)[Constants.INPUT_SPLIT_ZERO].length() > Constants.NUMBER_OF_RULES) throw  new IllegalArgumentException("Rules contain more than two numbers");

        //it is sufficiently clear that we have a decent input string except for one check of rule not found so lets prepare the model


    }

    public static V2ReplyModel prepareInputModel(String s) {
        V2ReplyModel v2ReplyModel = new V2ReplyModel();
        v2ReplyModel.setInputRuleArray(s.split("-",2)[Constants.INPUT_SPLIT_ZERO].toCharArray());
        for (char c:v2ReplyModel.getInputRuleArray()
             ) {
            if(Arrays.binarySearch(Constants.VALID_RULESET,c)<0) throw new IllegalArgumentException("Invalid input");
        }
        v2ReplyModel.setInputString(s.split("-",2)[Constants.INPUT_SPLIT_ONE]);
        return v2ReplyModel;
    }
}
