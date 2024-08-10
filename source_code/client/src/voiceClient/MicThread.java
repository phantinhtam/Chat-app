


package voiceClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.sound.sampled.TargetDataLine;




public class MicThread extends Thread{
    public TargetDataLine audio_in = null;
    public DatagramSocket dout;
    byte byte_buff[] = new byte[512];
    public InetAddress server_ip;
    public int server_port;
    @Override
    public void run()
    {
        int i = 0;
        while(VoiceClient.calling)
        {
            try {
                audio_in.read(byte_buff, 0, byte_buff.length);
                DatagramPacket data = new DatagramPacket(byte_buff,byte_buff.length,server_ip,server_port);
                System.out.println("Gui ?"+i++);
                dout.send(data);
            } catch (Exception e) {
            }
        }
        audio_in.close();
        audio_in.drain();
        System.out.println("Thread Dung Lai");
    }
}
