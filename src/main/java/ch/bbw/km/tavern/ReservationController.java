package ch.bbw.km.tavern;

import ch.bbw.km.tavern.models.Reservation;
import ch.bbw.km.tavern.models.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Controller
public class ReservationController {

    @Autowired
    ReservationService service;

    @Autowired
    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @GetMapping("/addreservation")
    public String addReservation(Model model) {
        System.out.println("ReservationController.addReservation");
        Reservation newReservation = new Reservation("Al-Kubaisi","Abdullah", "+41785621864","3", "apero", "vegi", "", new Date());
        model.addAttribute("reservation", newReservation);
        return "reservationview";
    }

    @PostMapping("/addreservation")
    public String addReservation(@ModelAttribute("reservation") Reservation reservation) {
        System.out.println("ReservationController.addReservation");
        System.out.println(reservation);
        service.getReservationList().add(reservation);
        return "redirect:/reservationlistview";
    }

//   @GetMapping("/addesreservation")
//   public String showReservationList(){
//      System.out.println("redirecting to reservationlistviww.html");
//      return "redirect:/reservationlistview.html";
//   }

//    @GetMapping("/addreservation")
//    public String addReservation(HttpServletRequest request) {
//        System.out.println("ReservationController.addReservation");
//        printRequest(request);
//        return "redirect:/reservationlistview.html";
//    }

//    @PostMapping("/addreservation")
//    public String postReservation(HttpServletRequest request) {
//        System.out.println("ReservationController.addReservation");
//        printRequest(request);
//        return "redirect:/reservationlistview.html";
//    }

//    @PostMapping("/addreservation")
//    public String postReservation(@RequestParam String lastName, @RequestParam String firstName, @RequestParam String phone, @RequestParam String reservations, @RequestParam String dish, @RequestParam String eatingHabit, @RequestParam String notes) {
//        System.out.println("ReservationController.addReservation");
//        System.out.println("lastName: " + lastName + "\n" + "firstName: " + firstName + "\n" + "phone: " + phone + "\n" + "reservations: " + reservations + "\n" + "dish: " + dish + "\n" + "eating habit: " + eatingHabit + "\n" + "notes: " + notes);
//        return "redirect:/reservationlistview.html";
//    }

    //    @PostMapping("/addreservation")
//    public String postReservation(@RequestParam String lastName, @RequestParam String firstName, @RequestParam String phone, @RequestParam String reservations, @RequestParam String dish, @RequestParam String eatingHabit, @RequestParam String notes) {
//        System.out.println("ReservationController.addReservation");
//        Reservation reservation = new Reservation(lastName, firstName, phone, reservations, dish, eatingHabit, notes);
//        System.out.println(reservation.toString());
//        return "redirect:/reservationlistview.html";
//    }
//
//    ArrayList<Reservation> reservationList = new ArrayList<Reservation>();
//
//    @PostMapping("/addreservation")
//    public String postReservation(@RequestParam String lastName, @RequestParam String firstName, @RequestParam String phone, @RequestParam String reservations, @RequestParam String dish, @RequestParam String eatingHabit, @RequestParam String notes) {
//        System.out.println("ReservationController.addReservation");
//        Reservation reservation = new Reservation(lastName, firstName, phone, reservations, dish, eatingHabit, notes);
//        System.out.println(reservation);
//        reservationList.add(reservation);
//        System.out.println(reservationList);
//        return "redirect:/reservationlistview.html";
//    }
//
//    private void printRequest(HttpServletRequest request) {
//        System.out.println("Header:");
//        Collections.list(request.getHeaderNames()).forEach((name) -> {
//            System.out.println("\t" + name + ": " + request.getHeader(name));
//        });
//        System.out.println("QueryString:");
//        System.out.println("\t" + request.getQueryString());
//        System.out.println("Body Parameters:");
//        request.getParameterMap().forEach((name, value) -> {
//            System.out.println("\t" + name + ": " + request.getParameter(name));
//        });
//    }
//    @GetMapping("/addreservation")
//    public String addReservation() {
//        System.out.println("ReservationController.addReservation");
//        return "reservationview";
//    }
//
//    @GetMapping("/reservationlistview")
//    public String showReservationListViw() {
//        System.out.println("ReservationController.showReservationList");
//        return "reservationlistview";
//    }
//
//    @PostMapping("/addreservation")
//    public String addReservationPost() {
//        System.out.println("ReservationController.addReservationPost");
//        return "redirect:/reservationlistview.html";
//    }

}
