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

    public String checkMobileNo(String num) {

        if(num.matches("^[+]?[0-9]{2}[ ][0-9]{10}$"))
            return "Valid";
        return "InValid";
    }

    public String checkPassword(String pw) {
        if(pw.matches("^[0-9a-zA-Z]{8,}$"))
            return "Valid";
        return "InValid";
    }
}
