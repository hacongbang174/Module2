package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static final String NameClass = "^[CAP][0-9]{4}[GHIK]$";
    public NameClass() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NameClass);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
