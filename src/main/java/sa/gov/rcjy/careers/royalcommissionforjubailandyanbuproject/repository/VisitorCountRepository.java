package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.VisitorCount;

import java.time.LocalDate;

@Repository
public interface VisitorCountRepository extends JpaRepository<VisitorCount, Long> {
    // Custom query methods, if required
    VisitorCount findByDate(LocalDate date);
}