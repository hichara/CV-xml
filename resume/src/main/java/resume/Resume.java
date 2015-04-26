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

    private List<Formation> formations;

    private List<Langue> langues;

    public Resume() {
        id = 0;
        firstName = "unknown";
        lastName = "unknown";
        this.formations = new ArrayList<Formation>();
        this.formations.add(new Formation());
        this.langues = new ArrayList<Langue>();
        this.langues.add(new Langue());
    }

    public Resume(int i, String name, String lastName) {
        this.firstName = name + i;
        this.lastName = lastName + i;
        this.id = i;

        if(lastName == "") {
            this.lastName = "unknown";
        }

        if(name == "") {
            this.firstName = "unknown";
        }

    }

    public Resume(Resume r) {
        this.firstName = r.getFirstName();
        this.lastName  = r.getLastName();
        this.id = r.getId();
        this.formations = r.getFormations();
        this.langues = r.getLangues();
    }

    public Resume(int i, String name, String lastName, List<Formation> forms, List<Langue> langs) {
        this(i, name, lastName);
        if(forms == null) {
            this.formations = new ArrayList<Formation>();
            this.formations.add(new Formation());
        }

        if(langs == null) {
            this.langues = new ArrayList<Langue>();
            this.langues.add(new Langue());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> forma) {
        this.formations = forma;
    }

    public List<Langue> getLangues() {
        return langues;
    }

    public void setLangues(List<Langue> langs) {
        this.langues = langs;
    }
}
