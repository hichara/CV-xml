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

    static BddCV resumes;
    static int id;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody BddCV getResumeInXML() {
        if(resumes == null)
            resumes = new BddCV();

            resumes.allCV.add(new Resume(id, "unknown", "unknown"));
            id++;

        return resumes;
    }

    /*
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody BddCV getAllResumes(){
        return resumes;
    }*/

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody BddCV getCVById(@PathVariable String id) {

        String[] tab = id.split("-");
        List<Integer> l =  new ArrayList<Integer>();

        for(String token : tab) {
            try {
                int i = Integer.parseInt(token);
                l.add(i);
            } catch (Exception e) {

            }
        }

       return resumes.getById(l);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Message logs(@RequestBody Resume r) {

        resumes.allCV.add(r);

        return new Message("CV ajouter");
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