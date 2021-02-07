package com.trycloud.utilities;

import com.github.javafaker.Faker;

public class BrowserUtils {
   
       
    public static void sleep(int second) {
        second  *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e) {
            System.out.println("something happened in sleep method");
        }
    }
    
    
    
    public static String faker(String select){
        Faker faker=new Faker();
        
        if(select.equalsIgnoreCase("Title")){
            //xpath.send keys
            return faker.job().title();
        }
        
        
        
        return faker();
    }

}
