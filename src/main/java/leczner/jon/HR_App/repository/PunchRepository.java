package leczner.jon.HR_App.repository;

import leczner.jon.HR_App.domain.Punch;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jonathanleczner on 10/25/16.
 */
public interface PunchRepository extends JpaRepository<Punch, Long> {
}
