package com.rebiekong.tools.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author RebieKong
 */
@Component
public class ScheduleJob {

    private int udpPort = 43210;

    @Scheduled(cron = "* * * * * ? ")
    public void updateLight() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(udpPort);
        String discover = "M-SEARCH * HTTP/1.1 \r\n" +
                "HOST: 239.255.255.250:1982\r\n" +
                "MAN: \"ssdp:discover\" \r\n" +
                "ST: wifi_bulb";
        DatagramPacket discoverPacket = new DatagramPacket(discover.getBytes(), discover.length(), InetAddress.getByName("255.255.255.255"), 1982);
        datagramSocket.send(discoverPacket);
    }
}