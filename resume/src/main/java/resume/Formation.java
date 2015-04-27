package resume;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hichara on 26/04/15.
 */


@XmlRootElement(name = "scolarite")
public class Formation {

    private String titre;

    private String description;

    public Formation() {
        this.titre = "not specified";
        this.description = "not specified";
    }

    public Formation(String titre, String description) {
        this();

        this.titre = titre;
        this.description = description;

        if(description == "") {
            this.description = "not specified";
        }

        if(titre == "") {
            this.titre = "not specified";
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

}
