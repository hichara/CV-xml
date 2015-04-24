package resume;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hichara on 16/04/15.
 */


@XmlRootElement(name = "competence")
public class Competence {

    private String name;

    private String niveau;

    private String type;

    public  Competence() {

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getNiveau() {
        return niveau;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    @XmlElement
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
