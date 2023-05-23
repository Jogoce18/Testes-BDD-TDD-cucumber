package com.example;

public class StringManipulator {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String convertToUppercase(String str) {
        return str.toUpperCase();
    }

    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
