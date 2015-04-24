package resume;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hichara on 24/04/15.
 */

@XmlRootElement
public class Message {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message() {
        message = "no message";
    }

    public Message(String s) {
        message = s;
    }

}
