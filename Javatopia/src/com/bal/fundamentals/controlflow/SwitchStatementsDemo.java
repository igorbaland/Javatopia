package com.bal.fundamentals.controlflow;

public class SwitchStatementsDemo {
    public void demo() {
        //String role = "admin";
        int intRole = 1;

        switch (intRole) {
            //case "admin":
            case 1:
                System.out.println("You're an admin");
                //if we don't break, java execute the following lines
                break;

//            case "moderator":
            case 2:
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You are a guest");

        }

//
//        if (role == "admin")
//            System.out.println("You're an admin");
//        else if (role == "moderator")
//            System.out.println("You're a moderator");
//        else
//            System.out.println("You're a guest");
    }
}
