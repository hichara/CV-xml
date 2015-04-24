package resume;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hichara on 16/04/15.
 */
@XmlRootElement(name = "Cvs")
public class BddCV {

    List<Resume> allCV;

    public List<Resume> getAllCV() {
        return allCV;
    }

    public void setAllCV(List<Resume> allCV) {
        this.allCV = allCV;
    }



    public BddCV() {
        allCV = new ArrayList<>();
    }
}
