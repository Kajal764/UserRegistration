package com.bridgelabz;


public class UserRegisteration {

    public String checkName(String name) {
        if(name.matches("^[A-Z]{1}[a-z]{2,}$"))
            return "Valid";
        return "Invalid";
    }


    public String checkEmailId(String emailId) {
        if(emailId.matches("^[a-zA-Z0-9]{1,}[.]?[a-zA-Z0-9]{1,}?[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,4}){1,2}$"))
            return "Valid";
        return "InValid";
    }
}
