package com.beta.customUtil;

import com.beta.model.V2ReplyModel;

import java.security.NoSuchAlgorithmException;

public interface Rule {
    public static void executeRule(V2ReplyModel v2ReplyModel) throws NoSuchAlgorithmException {
    }

    public static void postexecuteRule(V2ReplyModel v2ReplyModel) {
    }
}
