package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern firstName = Pattern.compile("^[A-Z][a-z]{2,}$");
    static Pattern lastName=Pattern.compile("^[A-Z][a-z]{2,}$");
    static Pattern emailId=Pattern.compile("^[a-z]{3}[.]?[a-z]{0,3}[@][a-z]{2}[.][a-z]{2}[.]?[a-z]{0,2}$");

    public static void main(String[] args) {
        Matcher matcher1 = firstName.matcher("Manoj");
        if (matcher1.matches())
            System.out.println(true);
        else
            System.out.println("Enter valid first name");
        Matcher matcher2 = lastName.matcher("Kumar");
        if (matcher2.matches())
            System.out.println(true);
        else
            System.out.println("Enter valid last name");
        Matcher matcher3 = emailId.matcher("abc@bl.co");
        if (matcher3.matches())
            System.out.println(true);
        else
            System.out.println("Enter valid email Id");
    }
}
