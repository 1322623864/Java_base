package com.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Iptext {
    public static void main(String[] args) {

        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
