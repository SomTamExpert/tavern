package ch.bbw.km.tavern.models;

public class Reservation {
    public String lastName;
    public String firstName;
    public String reservations ;
    public String dish;
    public String eatingHabit;
    public String notes;

    public Reservation(String lastName, String firstName, String reservations, String dish, String eatingHabit, String notes) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.reservations = reservations;
        this.dish = dish;
        this.eatingHabit = eatingHabit;
        this.notes = notes;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getReservations() {
        return reservations;
    }

    public void setReservations(String reservations) {
        this.reservations = reservations;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getEatingHabit() {
        return eatingHabit;
    }

    public void setEatingHabit(String eatingHabit) {
        this.eatingHabit = eatingHabit;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", reservations='" + reservations + '\'' +
                ", dish='" + dish + '\'' +
                ", eatingHabit='" + eatingHabit + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
