package leczner.jon.HR_App.controller;

import leczner.jon.HR_App.domain.Punch;
import leczner.jon.HR_App.repository.PunchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jonathanleczner on 10/25/16.
 */
@RestController
@RequestMapping(value = "/punches")
//@CrossOrigin(origins = "http://localhost:9000")
public class PunchController {

    private PunchRepository punchRepository;

    @Autowired
    public PunchController(PunchRepository punchRepository) {
        this.punchRepository = punchRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Punch> getAllPunch() {
        return punchRepository.findAll();
    }

    @RequestMapping(value = "/timecard/{id}", method = RequestMethod.GET)
    public List<Punch> getPunchesForEmployee(@PathVariable long id) {
        return punchRepository.findByEmployeeId(id);
    }

    @RequestMapping(value = "/punch", method = RequestMethod.POST)
    public Punch submitPunch(@RequestBody Punch punch) {
        punchRepository.save(punch);
        return punch;
    }

    @RequestMapping(value = "/punch", method = RequestMethod.OPTIONS)
    public ResponseEntity handle() {
      return new ResponseEntity(HttpStatus.OK);
    }
}
