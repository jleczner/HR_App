package leczner.jon.HR_App.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jonathanleczner on 10/25/16.
 */
//@Entity
//@Table(name="punch")
public class Punch {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long employeeId;
    private Date punchTime;

//    @Transient
    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Punch(Long employeeId, String date) throws ParseException {
        this.employeeId = employeeId;
        this.punchTime = format.parse(date);
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

//    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getPunchTime() {
        return punchTime;
    }

    public void setPunchTime(Date punchTime) {
        this.punchTime = punchTime;
    }
}
