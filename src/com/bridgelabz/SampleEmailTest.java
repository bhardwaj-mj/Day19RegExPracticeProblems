package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailTest {
    static Pattern pattern = Pattern.compile("^[a-z]{3}[-.+]?[0-9]{0,3}[@][a-z0-9]+[.]?[a-z]{2,3}[.]?[a-z]{2,3}$");
    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("abc@1.com");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false); //[a-z]{4,}[@][a-z]{0,}[.][a-z]{2,3}
    }
}
