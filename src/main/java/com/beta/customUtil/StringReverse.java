package com.beta.customUtil;

import com.beta.model.V2ReplyModel;

public final class StringReverse implements Rule {
    /**
     * Don't let anyone instantiate this class.
     */
    private StringReverse(){};
    //Written only for testing method not used anywhere else
  public static String reverseString(String message) {
      StringBuffer newString = new StringBuffer(message);
      return String.valueOf(newString.reverse());
  }



    public static void executeRule(V2ReplyModel v2ReplyModel) {
        StringBuffer newString = new StringBuffer(v2ReplyModel.getInputString());
        v2ReplyModel.setResponseString(String.valueOf(newString.reverse()));
    }


    public static void postexecuteRule(V2ReplyModel v2ReplyModel) {
        v2ReplyModel.setInputString(v2ReplyModel.getResponseString());
    }
}
