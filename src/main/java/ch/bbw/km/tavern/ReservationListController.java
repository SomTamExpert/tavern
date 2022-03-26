package ch.bbw.km.tavern;

import ch.bbw.km.tavern.models.Reservation;
import ch.bbw.km.tavern.models.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationListController {

    @Autowired
    ReservationService service;

    @Autowired
    public ReservationListController(ReservationService service) {
        this.service = service;
    }

    @GetMapping("/reservationlistview")
    public String showReservationList(Model model) {
        System.out.println("ReservationListController.showReservationList");
        model.addAttribute("reservationlist", service.getReservationList());
        model.asMap().forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));
        return "reservationlistview";
    }

}
