package com.beta.replyservice;

import com.beta.constants.RuleMapper;
import com.beta.customUtil.InputValidatorAndParser;
import com.beta.customUtil.Rule;
import com.beta.model.V2ReplyModel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class V2Reply {

private V2ReplyModel v2ReplyModel ;

    public V2Reply(String message) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        InputValidatorAndParser.isValidFormat(message);
        v2ReplyModel = InputValidatorAndParser.prepareInputModel(message);
        for (char rule:v2ReplyModel.getInputRuleArray()
             ) {

            Class<?> c = RuleMapper.getRuleMapper().get(rule);//gives you a class
            Method methodExecuteRule = c.getMethod("executeRule",V2ReplyModel.class);
            methodExecuteRule.invoke(null,v2ReplyModel);
            Method methodPostExecuteRule = c.getMethod("postexecuteRule",V2ReplyModel.class);
            methodPostExecuteRule.invoke(null,v2ReplyModel);
        }
    }

    public V2ReplyModel getV2ReplyModel() {
        return v2ReplyModel;
    }
}
