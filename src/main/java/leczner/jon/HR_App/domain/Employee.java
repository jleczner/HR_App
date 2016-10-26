package leczner.jon.HR_App.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jonathanleczner on 10/25/16.
 */
//@Entity
//@Table(name="employee")
public class Employee {

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private List<Date> punches;

    public Employee(String name) {
        this.name = name;
        punches = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Date> getPunches() {
        return punches;
    }

    @Override
    public String toString() {
        return name;
    }
}
