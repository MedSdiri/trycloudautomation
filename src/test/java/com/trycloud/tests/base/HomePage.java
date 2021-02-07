package com.trycloud.tests.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends TestBase {


    // List of expected module names
    public static List<String> listOfMenus = new ArrayList<>(Arrays.asList("dashboard", "files",
            "photos", "activity", "spreed", "mail", "contacts", "circles","calendar", "deck"));

    public static ArrayList<String> userNames = new ArrayList<>(Arrays.asList("userName1", "userName2",
            "userName3", "userName4"));

}
