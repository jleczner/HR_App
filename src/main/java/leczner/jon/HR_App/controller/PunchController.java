package leczner.jon.HR_App.controller;

import leczner.jon.HR_App.domain.Employee;
import leczner.jon.HR_App.domain.Punch;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jonathanleczner on 10/25/16.
 */
@RestController
public class PunchController {

    private static List<Punch> punches = new ArrayList<Punch>();

    static {
        try {
            punches.add(new Punch(0L, "2016-10-25 09:00:00"));
            punches.add(new Punch(0L, "2016-10-25 17:00:00"));
            punches.add(new Punch(1L, "2016-10-25 09:01:00"));
            punches.add(new Punch(1L, "2016-10-25 16:30:00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/punches/all")
    public List<Punch> getAll() {
        return punches;
    }

    @RequestMapping("/punches/findBy/employee/{employee}")
    public List<Punch> findByEmployee(@PathVariable Employee employee) throws
            ParseException{
        return punches
                .stream()
                .filter(punch -> punch.getEmployeeId().equals(employee.getId()))
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/punch", method = RequestMethod.POST)
    public Punch add(@RequestBody Punch punch) {
        punches.add(punch);
        return punch;
    }
}
