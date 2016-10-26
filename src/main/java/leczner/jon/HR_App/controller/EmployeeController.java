package leczner.jon.HR_App.controller;

import leczner.jon.HR_App.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jonathanleczner on 10/25/16.
 */
@RestController
public class EmployeeController {
    private static final String VIEW_INDEX = "index";

    @Autowired
    EmployeeRepository repo;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName(VIEW_INDEX);
        modelAndView.addObject("employee", repo.findAll());
        return modelAndView;
    }
}
