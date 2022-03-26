package ch.bbw.km.tavern.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReservationService {

    private List<Reservation> reservationList = new ArrayList<>(
            Arrays.asList(
                    new Reservation("Meier", "Hans", "3", "apero", "vegi", "-"),
                    new Reservation("Zübli", "Paul", "2", "apero", "vegan", "")));


    public List<Reservation> getReservationList() {
        return reservationList;
    }
}
