package com.venkat.oauth2db.utils;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder {

    public static void main(String[] args) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        System.out.println(encoder.encode("srijan123"));
        //{bcrypt}$2a$10$tNkmiuaSVEnN/2IUSFB47O5HL2/6aTNBnu2SJm63lzDz0O9/LNqX.  -->pin
        //{bcrypt}$2a$10$cLALSQzgjiA5O1EWGknq9ezHUmzjLE4qog1A8rkWG8n9MzlXDMz3.  -->venkat123
        //{bcrypt}$2b$10$gVsm9dxvKbFkTSbZk3Mz6ecsLiJqGZVKv07RzwAv9RtJ5HsWrd9oS  -->srijan123
    }
}
