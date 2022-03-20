package ch.bbw.km.tavern.models;

public class Reservation {
    public String lastName;
    public String firstName;
    public String phone;
    public String reservations;
    public String dish;
    public String eatingHabit;
    public String notes;

    public Reservation(String lastName, String firstName, String phone, String reservations, String dish, String eatingHabit, String notes) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.reservations = reservations;
        this.dish = dish;
        this.eatingHabit = eatingHabit;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", reservations='" + reservations + '\'' +
                ", dish='" + dish + '\'' +
                ", eatingHabit='" + eatingHabit + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
