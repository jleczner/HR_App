package leczner.jon.HR_Server.repository;

import leczner.jon.HR_Server.domain.Punch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jonathanleczner on 10/25/16.
 */
@Repository
public interface PunchRepository extends JpaRepository<Punch, Long> {
    List<Punch> findByEmployeeIdLike(long id);
}
