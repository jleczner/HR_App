package leczner.jon.HR_Server.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by jonathanleczner on 10/27/16.
 */
@Service
public class PunchService {
  private static final Logger log = LoggerFactory.getLogger(PunchService.class);

  @Autowired
  JdbcTemplate jdbcTemplate;
  public void insertData(){
    log.info("> Table creation");
    jdbcTemplate.execute("DROP TABLE Punch IF EXISTS");
    jdbcTemplate.execute("CREATE TABLE Punch(id SERIAL, employeeID INT(10), punchTime TIMESTAMP)");
    log.info("> Inserting data...");
    jdbcTemplate.execute("INSERT INTO Punch(employeeID, punchTime) " +
      "VALUES(0, '2016-01-01 00:00:00.00')");
    jdbcTemplate.execute("INSERT INTO Punch(employeeID, punchTime) " +
      "VALUES(0,'2016-01-01 04:00:00.00')");
    jdbcTemplate.execute("INSERT INTO Punch(employeeID, punchTime) " +
      "VALUES(1, '2016-02-01 00:00:00.00')");
    jdbcTemplate.execute("INSERT INTO Punch(employeeID, punchTime) " +
      "VALUES(1,'2016-02-01 05:00:00.00')");
    log.info("> Done.");
  }
}
