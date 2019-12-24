package com.bridgelabz;


public class UserRegisteration {

    public String checkName(String name) {
        if(name.matches("^[A-Z]{1}[a-z]{2,}$"))
            return "Valid";
        return "Invalid";
    }
}
