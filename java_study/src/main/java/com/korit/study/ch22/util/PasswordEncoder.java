package main.java.com.korit.study.ch22.util;

import java.util.Objects;

public class PasswordEncoder {

    private static final String secrete = "암호화비밀번호";

    public static String encode(String str) {
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        long encodeHash = hash + Objects.hash(secrete);
        return Long.toHexString(encodeHash);
    }

    public boolean match(String str, String encodeStr) {
        if (Objects.isNull(str) || Objects.isNull(encodeStr)) {
            return false;
        }
        return encode(str).equals(encodeStr);
    }

//    public boolean isMatch(String str, String encodeStr) {
//        return encode(str).equals(encodeStr);
//    }
}
