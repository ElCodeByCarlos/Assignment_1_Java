//package sheridan.carlos.controller;
package sheridan.carlos.assignment_1_carlos_tello_dominguez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String showInput() {
        return "input"; // loads input.html
    }
}
