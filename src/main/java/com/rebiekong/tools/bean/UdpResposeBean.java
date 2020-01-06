package com.rebiekong.tools.bean;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UdpResposeBean {

    private MulticastSocket ds;
    static String multicastHost = "239.255.255.250";
    static Integer multicastPort = 1982;
    static InetAddress receiveAddress;

    public UdpResposeBean() throws IOException {
        ds = new MulticastSocket(multicastPort);
        receiveAddress = InetAddress.getByName(multicastHost);
        ds.joinGroup(receiveAddress);
    }
}
