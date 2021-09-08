package com.beta.customUtil;
import com.beta.model.V2ReplyModel;

import java.io.UnsupportedEncodingException;
import java.security.*;

import static javax.xml.bind.DatatypeConverter.*;

public final class StringEncoding implements Rule {

    //Written only for testing method not used anywhere else
    public static String encodeToHex(String message) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());
        byte[] digest = md.digest();
        String myHash = printHexBinary(digest).toLowerCase();
        return myHash;
    }


    public static void executeRule(V2ReplyModel v2ReplyModel) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(v2ReplyModel.getInputString().getBytes());
        byte[] digest = md.digest();
        String myHash = printHexBinary(digest).toLowerCase();
        v2ReplyModel.setResponseString(myHash);
    }


    public static void postexecuteRule(V2ReplyModel v2ReplyModel) {
        v2ReplyModel.setInputString(v2ReplyModel.getResponseString());
    }
}
