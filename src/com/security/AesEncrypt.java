package com.security;

import org.junit.jupiter.api.Test;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class AesEncrypt {

    @Test
   void  testSystematicExcryption() throws NoSuchAlgorithmException {

        KeyGenerator generator =  KeyGenerator.getInstance("AES");
        generator.init(143);
        Key key = generator.generateKey();
//        Utils.printByte


    }
}
