package com.raymundo.midtermexam;

import org.testng.annotations.Test;

/**
 * Created by joselitowilliamraymundo on 2/3/18.
 */
public class VerificationPage {

    @Test
    public static void reverseString(){

        ArrayManipulation arrayManipulation = new ArrayManipulation();
        arrayManipulation.reverseEverything("Joji Raymundo");
    }
    @Test
    public static void listMenu() {

        MenuList menuList=new MenuList();
        menuList.foodDescription();

    }
}
