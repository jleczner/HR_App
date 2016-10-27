package leczner.jon.HR_App.repository;

import leczner.jon.HR_App.domain.Punch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonathanleczner on 10/27/16.
 */
@Component
public class DatabaseSeeder implements CommandLineRunner {
    private PunchRepository punchRepository;

    @Autowired
    public DatabaseSeeder(PunchRepository punchRepository) {
        this.punchRepository = punchRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Punch> punchList = new ArrayList<>();
        punchList.add(new Punch(0L, "10-27-2016 09:00:00"));
        punchList.add(new Punch(1L, "10-27-2016 09:01:00"));
        punchList.add(new Punch(1L, "10-27-2016 04:30:00"));
        punchList.add(new Punch(0L, "10-27-2016 05:00:00"));

        punchRepository.save(punchList);
    }
}
