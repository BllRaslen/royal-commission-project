package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service;




import org.springframework.stereotype.Service;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.repository.OfficeRepositoryArabic;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeServiceArabic {
    private final OfficeRepositoryArabic officeRepository;



    public OfficeServiceArabic(OfficeRepositoryArabic officeRepository) {
        this.officeRepository = officeRepository;
    }

    public List<OfficeArabic> getAllOffices() {
        return officeRepository.findAll();
    }

    public Optional<OfficeArabic> getOfficeById(Long id) {
        return officeRepository.findById(id);
    }

    public void saveOffice(OfficeArabic office) {
        officeRepository.save(office);
    }

    public void deleteOffice(Long id) {
        officeRepository.deleteById(id);
    }

    public List<OfficeArabic> searchOffices(String query) {
        return officeRepository.findBydepartmentNameContainingIgnoreCase(query);
    }
}
