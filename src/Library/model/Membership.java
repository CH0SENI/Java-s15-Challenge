package Library.model;

import java.time.LocalDate;

public class Membership {
    private LocalDate dateOfMembership;
    private int maxBookLimit;

    public Membership(LocalDate dateOfMembership, int maxBookLimit) {
        this.dateOfMembership = dateOfMembership;
        this.maxBookLimit = maxBookLimit;
    }

    public LocalDate getDateOfMembership() {
        return dateOfMembership;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }
}
