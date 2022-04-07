package ch.bbw.km.tavern.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {

    private List<Reservation> reservationList = new ArrayList<>(
            Arrays.asList(
                    new Reservation("Meier", "Hans", "+41796254136","3", "apero", "vegi", "-", new Date()),
                    new Reservation("Zübli", "Paul", "+41762541698","2", "apero", "vegan", "", new Date())));


    public List<Reservation> getReservationList() {
        return reservationList;
    }
}
