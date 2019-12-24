package com.bridgelabz;


public class UserRegisteration {

    public String checkFirstName(String fname) {
        if(fname.matches("^[A-Z]{1}[a-z]{2,}$"))
            return "Valid";
        return "Invalid";
    }
}
