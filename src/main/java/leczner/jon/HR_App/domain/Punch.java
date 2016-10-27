package leczner.jon.HR_App.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by jonathanleczner on 10/25/16.
 */
@Entity
public class Punch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long employeeId;
    private String punchTime;

//    @Transient
//    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Punch(Long employeeId, String punchTime) {
        this.employeeId = employeeId;
        this.punchTime = punchTime;
    }

    public Punch() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getPunchTime() {
        return punchTime;
    }

    public void setPunchTime(String punchTime) {
        this.punchTime = punchTime;
    }
}
