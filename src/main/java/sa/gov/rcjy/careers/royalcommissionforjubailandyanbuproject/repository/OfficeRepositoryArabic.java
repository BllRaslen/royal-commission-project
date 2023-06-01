package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;

import java.util.List;



@Repository
public interface OfficeRepositoryArabic extends JpaRepository<OfficeArabic, Long> {
    // Additional query methods can be added here if needed

    List<OfficeArabic> findBydepartmentNameContainingIgnoreCase(String query);

}