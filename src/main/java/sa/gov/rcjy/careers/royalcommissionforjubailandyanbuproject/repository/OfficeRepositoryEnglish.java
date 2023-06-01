package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeEnglish;

import java.util.List;



@Repository
public interface OfficeRepositoryEnglish extends JpaRepository<OfficeEnglish, Long> {
    // Additional query methods can be added here if needed

    List<OfficeEnglish> findBydepartmentNameContainingIgnoreCase(String query);

}