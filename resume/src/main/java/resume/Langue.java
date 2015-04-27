package resume;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hichara on 16/04/15.
 */


@XmlRootElement(name = "language")
public class Langue {

    private String name;

    private String niveau;

    public Langue() {
        name = "not specified";
        niveau = "not specified";
    }

    public Langue(String name, String niveau) {
        this.name = name;
        this.niveau = niveau;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
