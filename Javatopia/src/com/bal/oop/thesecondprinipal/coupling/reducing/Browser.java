package com.bal.oop.thesecondprinipal.coupling.reducing;

public class Browser {
    public void navigate(String address) {
        //per lightbulb > generate automatically method. Because we stored the return in a string object is suggesting
        //to use a String class a return type.
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    //set to provide, to hide implementation data
    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }


    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
