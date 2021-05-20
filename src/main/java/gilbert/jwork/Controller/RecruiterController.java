package gilbert.jwork.Controller;

import gilbert.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Recruiter> getAllRecruiter() {
        return DatabaseRecruiter.getRecruiterDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Recruiter getRecruiterById(@PathVariable int id) throws RecruiterNotFoundException {
        return DatabaseRecruiter.getRecruiterById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="phoneNumber") String phoneNumber,
                            @RequestParam(value="city") String city,
                            @RequestParam(value="province") String province,
                            @RequestParam(value="description") String description) {
        Recruiter recruiter= new Recruiter(DatabaseRecruiter.getLastId() + 1, name, email, phoneNumber, new Location(city, province, description));
        DatabaseRecruiter.addRecruiter(recruiter);
        return recruiter;
    }
}