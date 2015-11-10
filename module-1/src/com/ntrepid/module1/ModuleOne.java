package com.ntrepid.module1;

import com.google.common.base.CharMatcher;
import com.ntrepid.module2.*;

public class ModuleOne {
    
    String input = "This invoice has an id of 192/10/10";
    
    CharMatcher charMatcher = CharMatcher.DIGIT.or(CharMatcher.is('/'));
    
    String output = charMatcher.retainFrom(input);
    
    public static void main(String args[]){
        System.out.println("Hello World!");
        ModuleTwo.moduleTwo();
    }

}
