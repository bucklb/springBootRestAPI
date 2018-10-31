package restApi;

import org.springframework.web.bind.annotation.*;

@RequestMapping("")     // <- can specify the path on the URL that we relate to
@RestController         // <- make sure spring recognises this as a rest controller
public class RestApiController {

    // in case no link is requested, give them something to look at.  A clue as to what will respond would be good
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String sayHome() {
        return "There's no place like it";
    }

    // Pass back quote as simple string (that might contain a complex payload)
    @RequestMapping(value = "/help", method = RequestMethod.GET)
    public String sayHelp() {
        return "Handsome is as handsome does";
    }


}
