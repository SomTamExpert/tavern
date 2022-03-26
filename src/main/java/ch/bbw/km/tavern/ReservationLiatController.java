package ch.bbw.km.tavern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationLiatController {

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
    @GetMapping("/addreservation")
    public String addReservation() {
        System.out.println("ReservationController.addReservation");
        return "reservationview";
    }

    @GetMapping("/reservationlistview")
    public String showReservationListViw() {
        System.out.println("ReservationController.showReservationList");
        return "reservationlistview";
    }

    @PostMapping("/addreservation")
    public String addReservationPost() {
        System.out.println("ReservationController.addReservationPost");
        return "redirect:/reservationlistview.html";
    }
}
