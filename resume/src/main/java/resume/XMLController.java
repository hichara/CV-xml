package resume; /**
 * Created by hichara on 16/04/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/resume")
public class XMLController {

    static BddCV resumes;


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody BddCV getResumeInXML() {
        if(resumes == null)
            resumes = new BddCV();

            resumes.allCV.add(new Resume());

        return resumes;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody BddCV getResumeInXMLWithPost() {
        if(resumes == null)
            resumes = new BddCV();

        resumes.allCV.add(new Resume(6));

        return resumes;
    }

    @RequestMapping(value="/something/{id}" ,method = RequestMethod.GET)
    public @ResponseBody Resume getResumeInXML(@PathVariable int id) {

        return resumes.allCV.get(id);
    }



}