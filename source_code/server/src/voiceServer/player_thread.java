/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voiceServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author TinhTam
 */
public class player_thread extends Thread{
    public DatagramSocket din;
    public SourceDataLine audio_out;
    byte[] buffer = new byte[512];
    @Override
    public void run()
    {
        DatagramPacket incoming = new DatagramPacket(buffer,buffer.length);
        while(VoiceServer.calling)
        {
            try {
                din.receive(incoming);
                buffer = incoming.getData();
                audio_out.write(buffer, 0, buffer.length);
                
            } catch (Exception e) {
                
            }  
        }
        audio_out.close();
        audio_out.drain();
        System.out.println("Dung Lai");
    }
    
}
