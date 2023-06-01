package sa.gov.rcjy.careers.royalcommissionforjubailandyanbuproject.entity;

import java.time.LocalDate;




public class CountData {
    private LocalDate date;
    private long count;

    public CountData(LocalDate date, long count) {
        this.date = date;
        this.count = count;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
