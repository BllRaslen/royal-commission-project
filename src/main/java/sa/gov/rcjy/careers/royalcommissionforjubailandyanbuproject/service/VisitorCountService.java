package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.service;


import org.springframework.stereotype.Service;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.CountData;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity.VisitorCount;
import sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.repository.VisitorCountRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class VisitorCountService {
    private final VisitorCountRepository visitorCountRepository;

    public VisitorCountService(VisitorCountRepository visitorCountRepository) {
        this.visitorCountRepository = visitorCountRepository;
    }



    public Long incrementVisitorCount() {
        VisitorCount visitorCount = visitorCountRepository.findById(1L).orElse(null);


        LocalDate currentDate = LocalDateTime.now().toLocalDate();



        if (visitorCount == null) {
            // Create a new VisitorCount record if it doesn't exist
            visitorCount = new VisitorCount();
            visitorCount.setId(1L);
            visitorCount.setCount(1L);
        } else {
            Long count = visitorCount.getCount();
            if (count == null) {
                // Handle the case where the count value is null
                count = 1L;
            } else {
                count++; // Increment the count
            }
            visitorCount.setCount(count);
            visitorCount.setDate(currentDate);

        }
        visitorCount.setDate(currentDate);

        visitorCountRepository.save(visitorCount);
        return visitorCount.getCount();
    }


    public List<CountData> getVisitorCountsLast7Days() {
        List<CountData> counts = new ArrayList<>();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Retrieve the visitor count data for the last 7 days
        for (int i = 0; i >= 0; i--) {
            LocalDate date = currentDate.minusDays(i);
            VisitorCount visitorCount = visitorCountRepository.findByDate(date);
            long count = (visitorCount != null && visitorCount.getCount() != null) ? visitorCount.getCount() : 0;
            counts.add(new CountData(date, count));
        }

        return counts;
    }
}
