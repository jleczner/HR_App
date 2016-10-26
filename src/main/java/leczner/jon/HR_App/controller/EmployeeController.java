package leczner.jon.HR_App.controller;

import leczner.jon.HR_App.domain.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonathanleczner on 10/25/16.
 */
@RestController
public class EmployeeController {

    private static List<Employee> employees = new ArrayList<Employee>();

    static {
        employees.add(new Employee("Jon"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Lisa"));
    }

    @RequestMapping("/employee/all")
    public List<Employee> getAll() {
        return employees;
    }

    @RequestMapping(value="/employee",method = RequestMethod.POST )
    public Employee add(@RequestBody Employee employee){
        employees.add(employee);
        return employee;
    }

//    private static final String VIEW_INDEX = "index";
//
//    @Autowired
//    EmployeeRepository repo;
//
//    @RequestMapping(value="/", method = RequestMethod.GET)
//    public ModelAndView index(ModelAndView modelAndView){
//        modelAndView.setViewName(VIEW_INDEX);
//        modelAndView.addObject("employee", repo.findAll());
//        return modelAndView;
//    }
}
