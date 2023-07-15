package com.example.iranpeyma.util;

public class Validation {
public static boolean usernameValidation(String username){
    boolean check;
    check= username.length() > 4 && username.length() < 15;
    return check;
}
    public static boolean passwordValidation(String password){
        boolean check;
        if (password.length()>4&& password.length()<15){
            int numberOfDigit=0;
            for (Character character:password.toCharArray()){
                if (Character.isDigit(character)){
                    numberOfDigit++;
                }
            }
            check= numberOfDigit > 0;

        }else
            check=false;
        return check;
    }
}
