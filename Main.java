package com.company;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {


    PhoneNumber pn = new PhoneNumber("999", "0234567"),
            pn1 = new PhoneNumber("999", "0234567"),
            pn2 = new PhoneNumber("9089", "654321");
        System.out.println(pn);
        System.out.println(pn2);
    String s = "My phone number is " + pn + ".";
        System.out.println(s);
        System.out.println();

    Set<PhoneNumber> phNums = new HashSet<>();
        phNums.add(pn);
        phNums.add(pn1);
        phNums.add(pn11);
        phNums.add(pn2);
        for(
    PhoneNumber phNum :phNums)

    {
        
    }
} }
