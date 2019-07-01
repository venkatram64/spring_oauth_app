package com.venkat.oauth2db.utils;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder {

    public static void main(String[] args) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        System.out.println(encoder.encode("srijan123"));
        //{bcrypt}$2a$10$xKCCBBC1AYQnedqningrguXLJhfy7xwKBnMtSkNMsHkobkvLfhZ26  -->pin
        //{bcrypt}$2a$10$UKrekBtpsF8BhiZ3EulQFOx3gMmlb23xHsRc/ICcUxVqW1bip9.1q  -->venkat123
        //{bcrypt}$2a$10$sV9/f.Hni8ovl1nNpHh8C.CWnjZI9czQ4O53bZzBG25Sq1w1GvRGy  -->srijan123
    }
}
