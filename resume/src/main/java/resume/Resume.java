package resume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hichara on 16/04/15.
 */


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "resume")
public class Resume {


    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Resume(String ln, String fn) {
        firstName = fn;
        lastName = ln;
    }

    public Resume() {
        firstName = "unknownxcd";
        lastName = "unknowcdcn";
    }

    public Resume(int i) {
        firstName = "unknowcdn" + i;
        lastName = "unknzzown" + i;
    }



}
