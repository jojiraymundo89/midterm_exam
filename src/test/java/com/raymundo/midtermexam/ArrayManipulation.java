package com.raymundo.midtermexam;

import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by joselitowilliamraymundo on 2/3/18.
 */
public class ArrayManipulation extends BasePage {


    public void reverseEverything(String s) {

        char[] charArray = s.toCharArray();
        int length = charArray.length;
        char[] reverseArray = new char[length];
        int j = 0;
        for (int i = 0; i < length; i++) {
            j++;
            reverseArray[length - j] = charArray[i];
        }
        System.out.println(reverseArray);;
    }

}

/*Given a string, reverse each word in it and reverse the entire string. For example,
        if the given string is “hope you are doing well”, then the output should be “llew gniod era uoy epoh”.
        Assume that all characters in the string are lower case. Create a method called reverseEverything(String s)
        where ‘s’ is the input from the user in order to solve this question.*/