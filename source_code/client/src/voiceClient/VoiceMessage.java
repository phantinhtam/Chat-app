


package voiceClient;

import java.io.Serializable;

/**
 *
 * @author Le Nhut Nam
 */
public class VoiceMessage implements Serializable{
     // -1 means from client to server, otherwise chId generated by the server
    private long chId;
    //-1 means from client to server, otherwise timeStamp of the moment when the server receives the message
    private long timestamp, 
            ttl=2000; //2 seconds TTL
    // can carry any type of object. in this program, i used a sound packet, but it could be a string, a chunk of video, ...
    private final Object data;
    
    public VoiceMessage(long chId, long timestamp, Object data) {
        this.chId = chId;
        this.timestamp = timestamp;
        this.data = data;
    }

    public long getChId() {
        return chId;
    }

    public void setChId(long chId) {
        this.chId = chId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }
    
    public Object getData() {
        return data;
    }
}
