package ch.bbw.km.tavern.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Reservation {
    @NotNull
    @Size(min = 2, max = 50)
    private String lastName;
    @Size(min = 2, max = 50)
    private String firstName;
    @Max(6)
    private String reservations;
    @NotNull
    @Pattern(regexp = "^(0041|041|\\+41|\\+\\+41|41)?(0|\\(0\\))?([1-9]\\d{1})(\\d{3})(\\d{2})(\\d{2})$")
    private String phone;
    @NotNull
    private String dish;
    private String eatingHabit;
    private String notes;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    private Date reservationDate;

    public Reservation(String lastName, String firstName, String phone, String reservations, String dish, String eatingHabit, String notes, Date reservationDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.reservations = reservations;
        this.dish = dish;
        this.eatingHabit = eatingHabit;
        this.notes = notes;
        this.reservationDate = reservationDate;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
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
                ", reservationDate=" + reservationDate +
                '}';
    }
}
