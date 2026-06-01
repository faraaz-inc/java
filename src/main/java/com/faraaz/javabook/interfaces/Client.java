package com.faraaz.javabook.interfaces;

public class Client implements Callback{
    @Override
    public void callback() {
        System.out.println("Callback from client");
    }
}
