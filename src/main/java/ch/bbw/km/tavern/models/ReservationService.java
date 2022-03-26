package ch.bbw.km.tavern.models;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ReservationService {

    ArrayList<Reservation> reservationList = new ArrayList<Reservation>();

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }
}
