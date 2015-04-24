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

    private int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Resume() {
        id = -1;
        firstName = "unknown";
        lastName = "unknown";
    }

    public Resume(int i, String name, String lastName) {
        this.firstName = name + i;
        this.lastName = lastName + i;
    }
}
