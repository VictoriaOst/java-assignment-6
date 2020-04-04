package com.company;

public class Validator {
   static public boolean validatePivotChar(String pivot){
        if(pivot.length()==1 && Character.isLetter(pivot.charAt(0))){
            return true;
        }else return false;
    }
}
