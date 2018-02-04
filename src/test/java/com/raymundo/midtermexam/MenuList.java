package com.raymundo.midtermexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

/**
 * Created by joselitowilliamraymundo on 2/3/18.
 */
public class MenuList extends BasePage {

    public void foodDescription() {

        WebElement applesauce = DriverWrapper.getDriver().findElement(By.linkText("Applesauce, unsweetened"));
        WebElement cranberryApple = DriverWrapper.getDriver().findElement(By.linkText("Juice, Cranberry-apple drink"));
        System.out.println(applesauce);
        System.out.println(cranberryApple);

        List<WebElement> foods = DriverWrapper.getDriver().findElements(By.partialLinkText("food.name"));
        List<WebElement> servings = DriverWrapper.getDriver().findElements(By.partialLinkText("food._servingDesc"));

        HashMap<Integer, String> foodS = new HashMap<Integer, String>();
        HashMap<Integer, String> servingS = new HashMap<Integer, String>();

        for (int i = 0; i < foods.size(); i++) {
            foodS.put(i,foods.get(i).getText());
            servingS.put(i,servings.get(i).getText());
            System.out.println(foods.get(i).getText() + "     " + servings.get(i).getText());
        }
    }
}
/*WebElement apple = DriverWrapper.getDriver().findElement(By.className("hour"));
        WebElement pear = DriverWrapper.getDriver().findElement(By.xpath("//*[@id=\"timeline\"]/div/div[1]/span[1]/span"));
        System.out.println(pear.getText()+" "+apple.getText());*/
/*<html>
<head>
<body>
<div class=”itemContent”>

<span class="title ng-binding" ng-bind="food.name">Apple butter</span>
<span class="description ng-binding" ng-bind="food._servingDesc">1 Tbsp</span>

<span class="title ng-binding" ng-bind="food.name">Apple(s) fresh</span>
<span class="description ng-binding" ng-bind="food._servingDesc">1 medium</span>

<span class="title ng-binding" ng-bind="food.name">Applesauce, unsweetened </span>
<span class="description ng-binding" ng-bind="food._servingDesc">1/2 cup(s)</span>

<span class="title ng-binding" ng-bind="food.name">Apple(s), dried</span>
<span class="description ng-binding" ng-bind="food._servingDesc">1/4 cup(s)</span>

<span class="title ng-binding" ng-bind="food.name">Juice, Cranberry-apple drink</span>
<span class="description ng-binding" ng-bind="food._servingDesc">8 fl oz</span>

</div>
</body>
</head>
</html>

Use your knowledge of WebDriver to fetch the following:
a)	Display the third and fifth item from the above list. Your output should be:
Applesauce, unsweetened
Juice, Cranberry-apple drink
b)	Fetch each food name and its servings and store them in a Map.
Iterate through all the entries in the Map and print them.*/