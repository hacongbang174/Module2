package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String Phone = "^.(\\d{2}).-.(0\\d{9}).$";
    public PhoneNumber() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(Phone);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
