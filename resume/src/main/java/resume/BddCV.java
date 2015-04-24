package resume;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hichara on 16/04/15.
 */
@XmlRootElement
public class BddCV {

    List<Resume> allCV;

    public BddCV() {
        allCV = new ArrayList<>();
    }

    public List<Resume> getAllCV() {
        return allCV;
    }

    public void setAllCV(List<Resume> allCV) {
        this.allCV = allCV;
    }

    public Resume getById(int id) {

        for(int i = 0; i < allCV.size(); i++) {
            if(allCV.get(i).getId() == id) {
                return getAllCV().get(i);
            }
        }

        return  null;
    }

    public BddCV getById(List<Integer> l) {
        BddCV cvs = new BddCV();

        for(int i = 0; i < l.size(); i++) {
            Resume r = getById(i);
            cvs.allCV.add(r);
        }

        return cvs;
    }

    public Resume deleteById(int id) {
        Resume r = getById(id);

        if(r != null) {
            allCV.remove(r);
        }

        return  r;
    }

    public BddCV deleteById(List<Integer> l) {
        BddCV cvs = new BddCV();

        for(Integer i : l) {
            Resume r = getById(i);
            allCV.remove(r);
            cvs.allCV.add(r);
        }

        return  cvs;
    }
}
