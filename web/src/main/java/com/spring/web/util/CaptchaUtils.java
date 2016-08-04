package com.spring.web.util;

import java.util.Random;

/**
 * Created by Viet.Pham on 8/3/2016.
 */
public class CaptchaUtils {
    public static String generateCaptchaMethod2(int captchaLength){
        String saltChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuffer captchaStrBuffer = new StringBuffer();
        Random rnd = new Random();

        // build a random captchaLength chars salt
        while (captchaStrBuffer.length() < captchaLength){
            int index = (int) (rnd.nextFloat() * saltChars.length());
            captchaStrBuffer.append(saltChars.substring(index, index + 1));
        }
        return captchaStrBuffer.toString();
    }
}
