package ch.bbw.km.tavern;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ErrorController
 *
 * @author Peter Rutschmann
 * @version 23.03.2022
 */
@Controller
public class MyErrorController implements ErrorController {
   @GetMapping("/error")
   public String showError(){
      System.out.println("ErrorController.showError");
      return "errorview";
   }
}
