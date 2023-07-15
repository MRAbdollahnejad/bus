package com.example.iranpeyma.security;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class HashedPassword {
    public byte[] createHashedPassword(String pass) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();
//        byte[] salt = new byte[16];
//        secureRandom.nextBytes(salt);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
//        messageDigest.update(salt);
        return messageDigest
                .digest(pass.getBytes(StandardCharsets.UTF_8));
    }
}
