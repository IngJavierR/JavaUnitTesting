package com.howtoprogram.junit5.product;

public class ServiceDemo {

    public Boolean login(String usr, String pwd){
        if(usr.equals("javier") && pwd.equals("1234")){
            return true;
        }
        return false;
    }
}
