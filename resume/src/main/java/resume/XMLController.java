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

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody BddCV getResumeInXML() {
        if(resumes == null)
            resumes = new BddCV();

            resumes.allCV.add(new Resume());
            resumes.allCV.add(new Resume());

        return resumes;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody BddCV getAllResumes(){
        return resumes;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody BddCV getCVById(@PathVariable String path) {

        String[] tab = path.split("/");
        List<Integer> l =  new ArrayList<Integer>();

        for(String token : tab) {
            int i = Integer.parseInt(token);
            l.add(i);
        }

        return resumes.getById(l);
    }


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


    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Message logs(@RequestBody Resume r) {

        resumes.allCV.add(r);

        return new Message("CV ajouter");
    }

    /*
    @RequestMapping(value="/something/{id}" ,method = RequestMethod.GET)
    public @ResponseBody Resume getResumeInXML(@PathVariable int id) {

        return resumes.allCV.get(id);
    }
*/
}