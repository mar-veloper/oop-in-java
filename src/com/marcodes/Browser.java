package com.marcodes;

public class Browser {
    public void navigate(String address) {
       String ip = findIpAddress(address);
       String html = sendHttpRequset(ip);
        System.out.println(html);
    }

    private String sendHttpRequset(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}
