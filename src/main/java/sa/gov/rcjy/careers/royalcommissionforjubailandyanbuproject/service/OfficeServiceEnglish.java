package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeArabic;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.OfficeEnglish;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.repository.OfficeRepositoryEnglish;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeServiceEnglish {
    private final OfficeRepositoryEnglish officeRepository;



    public OfficeServiceEnglish(OfficeRepositoryEnglish officeRepository) {
        this.officeRepository = officeRepository;
    }

    public List<OfficeEnglish> getAllOffices() {
        return officeRepository.findAll();
    }

    public Optional<OfficeEnglish> getOfficeById(Long id) {
        return officeRepository.findById(id);
    }

    public void saveOffice(OfficeEnglish office) {
        officeRepository.save(office);
    }

    public void deleteOffice(Long id) {
        officeRepository.deleteById(id);
    }

    public List<OfficeEnglish> searchOffices(String query) {
        return officeRepository.findBydepartmentNameContainingIgnoreCase(query);
    }
}

