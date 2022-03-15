package ch.bbw.km.tavern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;

/**
 * TavernController
 *
 * @author Peter Rutschmann
 * @version 01.03.2022
 */
@Controller
public class TavernController {
   @GetMapping("/")
   public String showTavern(){
      System.out.println("TavernController.showTavern");
      return "tavernview";
   }
//   @GetMapping("/addesreservation")
//   public String showReservationList(){
//      System.out.println("redirecting to reservationlistviww.html");
//      return "redirect:/reservationlistview.html";
//   }

}
