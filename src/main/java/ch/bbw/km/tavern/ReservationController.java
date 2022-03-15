package ch.bbw.km.tavern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;

@Controller
public class ReservationController {

    @GetMapping("/addesreservation")
    public String addReservation(HttpServletRequest request){
        System.out.println("ReservationController.addReservation");
        printRequest(request);
        return "reservationlistview";
    }

    public void printRequest(HttpServletRequest request) {
        System.out.println("Header:");
        Collections.list(request.getHeaderNames()).forEach((name) -> {
            System.out.println("\t" + name + ": " + request.getHeader(name));
        });
        System.out.println("Querry String:");
        System.out.println("\t" + request.getQueryString());

        System.out.println("Body Parameters:");
        request.getParameterMap().forEach((name, value) -> {
            System.out.println("\t" + name + ":" + request.getParameter(name));
        });
    }
}
