package ch.bbw.km.tavern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TavernController
 *
 * @author Peter Rutschmann
 * @version 01.03.2022
 */
@Controller
public class TavernController {
    @GetMapping("/")
    public String showTavern() {
        System.out.println("TavernController.showTavern");
        return "tavernview";
    }
    @GetMapping("/contactview")
    public String showContact() {
        System.out.println("TavernController.showContact");
        return "contactview";
    }
}
