package fragranceia.manuscript.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("test", "test1123131");
        return "test";
    }
}