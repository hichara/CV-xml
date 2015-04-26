package resume; /**
 * Created by hichara on 16/04/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/resume")
public class XMLController {

    static BddCV resumes = new BddCV();
    static int id = 1;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody BddCV getResumeInXML() {
        return resumes;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Resume getCVById(@PathVariable String id) {

        int i = Integer.parseInt(id);
        Resume r = resumes.getById(i);

        if(r == null)
            r = new Resume();

        r.getFormations().add(new Formation("cdc", "edd"));
        r.getFormations().add(new Formation("caadc", "edd"));
        r.getFormations().add(new Formation("cdc", "e948"));

        return r;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Message logs(@RequestBody Resume r) {

        Resume rr = new Resume(r);

        id = id + 1;
        rr.setId(id);

        resumes.allCV.add(rr);

        return new Message("CV ajouter. ID : " + id);
    }

    // Implementer updadate
    // Implementter creation

/*
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Message deleteCV(@PathVariable String path) {

        String[] tab = path.split("/");
        List<Integer> l =  new ArrayList<Integer>();

        for(String token : tab) {
            int i = Integer.parseInt(token);
            l.add(i);
        }

        return new Message("CV supprimer");
    }
*/


}