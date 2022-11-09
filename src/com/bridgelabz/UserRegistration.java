package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern firstName = Pattern.compile("^[A-Z][a-z]{2,}$");
    static Pattern lastName=Pattern.compile("^[A-Z][a-z]{2,}$");
    static Pattern emailId=Pattern.compile("^[a-z]{3,}[.]?[a-z]*@[a-zA-Z]{2,}[.][a-z]{2,}[.]?[a-z]{0,2}$");
    static Pattern mobileNumber=Pattern.compile("^(91 )[0-9]{10}$");
    static Pattern password = Pattern.compile("^(?=.*[A-z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
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
        Matcher matcher3 = emailId.matcher("abc.xyz@bridgelabz.co.in");
        if (matcher3.matches())
            System.out.println(true);
        else
            System.out.println("Enter valid email Id");
        Matcher matcher4 = mobileNumber.matcher("91 9898989898");
        if (matcher4.matches())
            System.out.println(true);
        else
            System.out.println("Enter valid mobile number");
        Matcher matcher5 = password.matcher("manojKumar1");
        if (matcher5.matches())
            System.out.println(true);
        else
            System.out.println("Enter valid password");
    }
}
